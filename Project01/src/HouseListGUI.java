import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * A GUI for the HouseList Application.
 * 
 * @author Matt Andre
 * @date September 19, 2012
 * @version 1.0
 */
public class HouseListGUI extends JFrame {

	// ---------------------------------------------------------------

	// Holds the list of houses
	private HouseList houseList;

	// Declare Labels
	private JLabel criteriaLabel;
	private JLabel minLabel;
	private JLabel maxLabel;
	private JLabel priceLabel;
	private JLabel areaLabel;
	private JLabel numberOfBedroomsLabel;

	// Declare Fields
	private JTextField minPriceField;
	private JTextField maxPriceField;
	private JTextField minAreaField;
	private JTextField maxAreaField;
	private JTextField minNumberOfBedroomsField;
	private JTextField maxNumberOfBedroomsField;

	// Declare Textarea with scroll
	private JTextArea housesArea;
	private JScrollPane housesScroll;

	// Declare Buttons
	private JButton searchButton;
	private JButton quitButton;

	// ---------------------------------------------------------------

	/**
	 * @param houseList
	 */
	public HouseListGUI(HouseList houseList) {

		this.houseList = houseList;

		instantiateGUIComponents();
		buildGUI();
		addListeners();

		// Set default jframe close operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set window size
		pack();
		setSize(300, 350);

		// Set window visible
		setVisible(true);

	}

	// --------------------------------------------------------------

	/**
	 * Instantiates the GUI components
	 */
	private void instantiateGUIComponents() {

		// Initialize GUI Copmponents

		// Initialize Labels
		criteriaLabel = new JLabel("Criteria");
		minLabel = new JLabel("Min");
		maxLabel = new JLabel("Max");
		priceLabel = new JLabel("Price");
		areaLabel = new JLabel("Area");
		numberOfBedroomsLabel = new JLabel("Bedrooms");

		// Initialize Fields
		minPriceField = new JTextField(10);
		maxPriceField = new JTextField(10);
		minAreaField = new JTextField(10);
		maxAreaField = new JTextField(10);
		minNumberOfBedroomsField = new JTextField(10);
		maxNumberOfBedroomsField = new JTextField(10);

		// Initialize Text Area with scroll
		housesArea = new JTextArea("", 15, 0);
		housesArea.setLineWrap(true);
		housesScroll = new JScrollPane(housesArea);
		housesScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		// Initialize Buttons
		searchButton = new JButton("Search");
		quitButton = new JButton("Quit");

		// Set display fields to be not editable
		housesArea.setEditable(false);
	}

	// --------------------------------------------------------------

	/**
	 * Builds the GUI by adding the components to the frame.
	 */
	private void buildGUI() {

		JPanel criteriaPanel = new JPanel();
		JPanel buttonsPanel = new JPanel();
		JPanel matchingHousesPanel = new JPanel();

		// Set content panes to use grid layout
		criteriaPanel.setLayout(new GridLayout(4, 3, 10, 10));
		buttonsPanel.setLayout(new GridLayout(1, 2, 100, 100));
		matchingHousesPanel.setLayout(new GridLayout(1, 1, 10, 10));

		// Add GUI components to content panels
		criteriaPanel.add(criteriaLabel);
		criteriaPanel.add(minLabel);
		criteriaPanel.add(maxLabel);
		criteriaPanel.add(priceLabel);
		criteriaPanel.add(minPriceField);
		criteriaPanel.add(maxPriceField);
		criteriaPanel.add(areaLabel);
		criteriaPanel.add(minAreaField);
		criteriaPanel.add(maxAreaField);
		criteriaPanel.add(numberOfBedroomsLabel);
		criteriaPanel.add(minNumberOfBedroomsField);
		criteriaPanel.add(maxNumberOfBedroomsField);

		buttonsPanel.add(searchButton);
		buttonsPanel.add(quitButton);

		matchingHousesPanel.add(housesScroll);

		Container contentPane = getContentPane();

		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

		contentPane.add(criteriaPanel);
		contentPane.add(buttonsPanel);
		contentPane.add(matchingHousesPanel);

	}

	// --------------------------------------------------------------

	/**
	 * Adds listeners to the GUI buttons
	 */
	private void addListeners() {
		
		//Add listener to search button
		searchButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String minPriceInput = minPriceField.getText();
				String maxPriceInput = maxPriceField.getText();
				String minAreaInput = minAreaField.getText();
				String maxAreaInput = maxAreaField.getText();
				String minNumberOfBedroomsInput = minNumberOfBedroomsField.getText();
				String maxNumberOfBedroomsInput = minNumberOfBedroomsField.getText();
				
				double minPrice = Double.parseDouble(minPriceInput);
				double maxPrice = Double.parseDouble(maxPriceInput);
				int minArea = Integer.parseInt(minAreaInput);
				int maxArea = Integer.parseInt(maxAreaInput);
				int minNumberOfBedrooms = Integer.parseInt(minNumberOfBedroomsInput);
				int maxNumberOfBedrooms = Integer.parseInt(maxNumberOfBedroomsInput);
				
				Criteria criteria = new Criteria(minPrice, maxPrice, minArea, maxArea, 
						minNumberOfBedrooms, maxNumberOfBedrooms);
				
				String housesAreaOut = "";
				ArrayList<House> matchingHouses = houseList.getMatchingHouses(criteria);
				
				if(matchingHouses.size() > 0){
					housesAreaOut = "";
					Iterator<House> iterator = matchingHouses.iterator();
					House house;
									 
					while( iterator.hasNext() ){
					    
						house = iterator.next();
						housesAreaOut += house.toString() + "\n";
					    
					}
				}else{
					housesAreaOut = "No Matching Houses Found.";
				}
				
				housesArea.setText(housesAreaOut);
				
			}
			
		});
		
		//Add listener to quit button
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	// --------------------------------------------------------------

	/**
	 * The main method of the Application. Initializes the house list and GUI.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Initialize house list from text file
		HouseList houseList = new HouseList("src\\houses.txt");

		// Initialize the GUI from the house list
		new HouseListGUI(houseList);

	}

}