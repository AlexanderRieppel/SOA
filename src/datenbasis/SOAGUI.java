package datenbasis;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;

import org.jdom2.JDOMException;
import org.xml.sax.SAXException;

import vorjahrXMLundJAVA.XPathDemo;

/**
 * Erstellt eine Grafische Oberfläche
 * 
 * @author 
 * @version 
 */
public class SOAGUI extends JPanel {
	private XPathDemo xpath;
	private JButton search = new JButton("Search");
	private JButton create = new JButton("Create");
	private JButton save = new JButton("Save to XML");
	private JTextField tf1 = new JTextField();
	private JLabel l1 = new JLabel("New Entry"), l2 = new JLabel("Entry Search:");
	private JTextArea ta;
	private JScrollPane sbrText;
	private final JSplitPane splitPane = new JSplitPane();
	private final JLabel lblTopic = new JLabel("Topic:");
	private final JSplitPane splitPane_1 = new JSplitPane();
	private final JTextField textField = new JTextField();
	private final JLabel lblContent = new JLabel("Content");

	/**
	 * Erstellt die grafische Oberfläche
	 */
	public SOAGUI() {
		textField.setColumns(10);
		search.addActionListener(new ActionHandler());
		create.addActionListener(new ActionHandler());
		save.addActionListener(new ActionHandler());
		ta = new JTextArea("", 5, 50);
		ta.setLineWrap(true);
		sbrText = new JScrollPane(ta);
		sbrText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		JPanel p2 = new JPanel(), p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(search);
		p2.setLayout(new FlowLayout());
		p2.add(create);
		setLayout(new GridLayout(0, 1, 0, 0));
		
		add(splitPane);
		splitPane.setLeftComponent(l2);
		splitPane.setRightComponent(tf1);
		this.add(p1);
		this.add(l1);
		
		add(splitPane_1);
		splitPane_1.setLeftComponent(lblTopic);
		
		splitPane_1.setRightComponent(textField);
		this.add(sbrText);
		
		sbrText.setColumnHeaderView(lblContent);
		this.add(p2);
		this.add(save);
	}
	
	

	/**
	 * Klasse mit dem ActionHandler für die Buttons
	 */
	private class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (arg0.getSource() == create) {
				
			}
			if (arg0.getSource() == save) {

			}
			if (arg0.getSource() == search) {
				
			}

		}
	}
}
