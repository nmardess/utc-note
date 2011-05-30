package etunote;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PriseNote.java
 *
 * Created on 5 mai 2011, 13:37:25
 */


import java.awt.Color;
import java.awt.Component;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.GroupLayout.Group;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.JOptionPane;
/**
 *
 * @author mbayemoh
 */
public class PriseNoteView extends javax.swing.JPanel implements ActionListener {
	//TitleSpecificButton Title;
    /** Creates new form PriseNote */
	int numerotationTitle[] = {0,0,0,0,0,0};
	Note noteModel;
	Application app;
	Persistance pe;
	javax.swing.GroupLayout notePanelLayout;
	JFileChooser fc = new JFileChooser();
	String file;
	JPanel GeneralUVPanel = new javax.swing.JPanel();
	
	
    public PriseNoteView(Note model) {
    	this.noteModel = model;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	DefaultTreeModel Model=new DefaultTreeModel(null);
    	app = noteModel.getUvs().get(0).getSemesters().get(0).getApplication();
		pe = new Persistance();
    	
    	
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        noteScrollPane = new javax.swing.JScrollPane();
        notePanel = new javax.swing.JPanel();
        fields = new ArrayList<JTextField>();
        BlocButton = new javax.swing.JButton();
        ParagraphButton = new javax.swing.JButton();
        TitleButton = new javax.swing.JButton();
        CodeButton = new javax.swing.JButton();
        DrawButton = new javax.swing.JButton();
        GrasButton = new javax.swing.JButton();
        SoulignButton = new javax.swing.JButton();
        ItalicButton = new javax.swing.JButton();
        SurlignButton = new javax.swing.JButton();
        ListeButton = new javax.swing.JButton();
        ImageButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMenuItem OpenItem = new javax.swing.JMenuItem();
        JMenuItem SaveItem= new javax.swing.JMenuItem();
        JMenuItem SaveAsItem= new javax.swing.JMenuItem();
        JMenuItem QuitItem= new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        JMenuItem UndoItem = new javax.swing.JMenuItem();
        JMenuItem RedoItem= new javax.swing.JMenuItem();
        JMenuItem CutItem = new javax.swing.JMenuItem();
        JMenuItem CopyItem = new javax.swing.JMenuItem();
        JMenuItem DeleteItem = new javax.swing.JMenuItem();
        
        


        
// JPanel        
//        this.setTitle("Prise de Note");
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBackground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(jTree1);

        
        //SHOW THE CONTENT OF THE NOTE
        notePanel = updateNoteContent();
        
        noteScrollPane.setViewportView(notePanel);

        jTabbedPane1.addTab("Note de Cours", noteScrollPane);
        
        
        
        //Title= new TitleSpecificButton();
        
       // Title.setBackground(Color.red);
        //Title.addMouseListener(new MouseAdapter(){
        //    public void mouseDragged(MouseEvent e){
        //      JButton button = (JButton)e.getSource();
        //       TransferHandler handle = button.getTransferHandler();
         //       handle.exportAsDrag(button, e, TransferHandler.COPY);
          //  				}
        //	});
        
        BlocButton.setFont(new java.awt.Font("Times New Roman", 0, 14));
        BlocButton.setIcon(new ImageIcon(Tools.getPathToIcons("bloc.png")));
        BlocButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlocButtonActionPerformed(evt);
            }
        });

        ParagraphButton.setFont(new java.awt.Font("Times New Roman", 0, 14));
        ParagraphButton.setIcon(new ImageIcon(Tools.getPathToIcons("paragraph.png")));
        ParagraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParagraphButtonActionPerformed(evt);
            }
        });

        TitleButton.setFont(new java.awt.Font("Times New Roman", 0, 14));
        TitleButton.setIcon(new ImageIcon(Tools.getPathToIcons("title.png")));
        TitleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleButtonActionPerformed(evt);
            }
        });

        CodeButton.setFont(new java.awt.Font("Times New Roman", 0, 14));
        CodeButton.setText("+C");
        CodeButton.setBackground(Color.red);
        CodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodeButtonActionPerformed(evt);
            }
        });

        DrawButton.setFont(new java.awt.Font("Times New Roman", 0, 14));
        DrawButton.setText("+D");
        DrawButton.setBackground(Color.red);
        DrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrawButtonActionPerformed(evt);
            }
        });

        GrasButton.setFont(new java.awt.Font("Times New Roman", 0, 14));
		GrasButton.setIcon(new ImageIcon(Tools.getPathToIcons("format-text-bold.png")));
        GrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrasButtonActionPerformed(evt);
            }
        });

        SoulignButton.setFont(new java.awt.Font("Times New Roman", 0, 14));
		SoulignButton.setIcon(new ImageIcon(Tools.getPathToIcons("format-text-underline.png")));
        SoulignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoulignButtonActionPerformed(evt);
            }
        });

        ItalicButton.setFont(new java.awt.Font("Times New Roman", 0, 14));
        ItalicButton.setIcon(new ImageIcon(Tools.getPathToIcons("format-text-italic.png")));
        ItalicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItalicButtonActionPerformed(evt);
            }
        });

        SurlignButton.setFont(new java.awt.Font("Times New Roman", 0, 12));
        SurlignButton.setText("Surlign");
        SurlignButton.setBackground(Color.gray);
        SurlignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SurlignButtonActionPerformed(evt);
            }
        });

        ListeButton.setFont(new java.awt.Font("Times New Roman", 0, 12));
        ListeButton.setText("Liste");
        ListeButton.setBackground(Color.gray);
        ListeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListeButtonActionPerformed(evt);
            }
        });

        ImageButton.setFont(new java.awt.Font("Times New Roman", 0, 14));
        ImageButton.setIcon(new ImageIcon(Tools.getPathToIcons("image.png")));
        ImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImageButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        OpenItem.setText("Open");
        OpenItem.addActionListener(new java.awt.event.ActionListener()
        {
        	 public void actionPerformed(java.awt.event.ActionEvent evt) {
        		 OpenItemActionPerformed(evt);}
        });
        
        jMenu1.add(OpenItem);

        SaveItem.setText("Save");
        SaveItem.addActionListener(new java.awt.event.ActionListener()
        {
        	 public void actionPerformed(java.awt.event.ActionEvent evt) {
        		 SaveItemActionPerformed(evt);}
        });
        
        jMenu1.add(SaveItem);

        SaveAsItem.setText("Save as");
        SaveAsItem.addActionListener(new java.awt.event.ActionListener()
        {
        	 public void actionPerformed(java.awt.event.ActionEvent evt) {
        		 SaveAsItemActionPerformed(evt);}
        });
        jMenu1.add(SaveAsItem);

        QuitItem.setText("Quit");
        QuitItem.addActionListener(new java.awt.event.ActionListener()
        {
        	 public void actionPerformed(java.awt.event.ActionEvent evt) {
        		 QuitItemActionPerformed(evt);}
        });
        jMenu1.add(QuitItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        UndoItem.setText("Undo");
        UndoItem.addActionListener(new java.awt.event.ActionListener()
        {
        	 public void actionPerformed(java.awt.event.ActionEvent evt) {
        		 UndoItemActionPerformed(evt);}
        });
        jMenu2.add(UndoItem);

        RedoItem.setText("Redo");
        RedoItem.addActionListener(new java.awt.event.ActionListener()
        {
        	 public void actionPerformed(java.awt.event.ActionEvent evt) {
        		 RedoItemActionPerformed(evt);}
        });
        jMenu2.add(RedoItem);

        CutItem.setText("Cut");
        CutItem.addActionListener(new java.awt.event.ActionListener()
        {
        	 public void actionPerformed(java.awt.event.ActionEvent evt) {
        		 CutItemActionPerformed(evt);}
        });
        jMenu2.add(CutItem);

        CopyItem.setText("Copy");
        CopyItem.addActionListener(new java.awt.event.ActionListener()
        {
        	 public void actionPerformed(java.awt.event.ActionEvent evt) {
        		 CopyItemActionPerformed(evt);}
        });
        jMenu2.add(CopyItem);

        DeleteItem.setText("Delete");
        DeleteItem.addActionListener(new java.awt.event.ActionListener()
        {
        	 public void actionPerformed(java.awt.event.ActionEvent evt) {
        		 DeleteItemActionPerformed(evt);}
        });
        jMenu2.add(DeleteItem);

        jMenuBar1.add(jMenu2);

//        setJMenuBar(jMenuBar1);
// JPanel
        
        
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
        javax.swing.GroupLayout GeneralUVPanelLayout = new javax.swing.GroupLayout(GeneralUVPanel);
        GeneralUVPanel.setLayout(GeneralUVPanelLayout);
        GeneralUVPanelLayout.setHorizontalGroup(
            GeneralUVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GeneralUVPanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(651, 651, 651)
                .addGroup(GeneralUVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(GeneralUVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BlocButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ParagraphButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GrasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ItalicButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SoulignButton, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                        .addComponent(ImageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DrawButton, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(TitleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)))
            .addGroup(GeneralUVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GeneralUVPanelLayout.createSequentialGroup()
                    .addContainerGap(221, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(79, 79, 79)))
        );
        GeneralUVPanelLayout.setVerticalGroup(
            GeneralUVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GeneralUVPanelLayout.createSequentialGroup()
                .addGroup(GeneralUVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GeneralUVPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GeneralUVPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(TitleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ParagraphButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BlocButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ImageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(GrasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SoulignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ItalicButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(GeneralUVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(GeneralUVPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1, 0, 0, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GeneralUVPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(GeneralUVPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        //this.notePanel.add(jtextfield);
        //JPanel
        //pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImageButtonActionPerformed
        // TODO add your handling code here:
    	fc.setCurrentDirectory(new File("."));
		int returnVal = fc.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			try{
				file = fc.getSelectedFile().getAbsolutePath();
				System.out.println("Ajout d'une image");
		    	Image img = new Image(this.noteModel.getLastPosition() + 1, file);
		    	this.noteModel.addContent(img);
		    	notePanel = updateNoteContent();
				
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(this, 
						"Probleme fichier",
						"Erreur",
						JOptionPane.ERROR_MESSAGE);
			}
			
		}
    	//new AddImageView().setVisible(true);
    }//GEN-LAST:event_ImageButtonActionPerformed

    private void CodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodeButtonActionPerformed

    private void DrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrawButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DrawButtonActionPerformed

    private void GrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrasButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GrasButtonActionPerformed

    private void SoulignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoulignButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SoulignButtonActionPerformed

    private void ItalicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItalicButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItalicButtonActionPerformed

    private void SurlignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SurlignButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SurlignButtonActionPerformed

    private void ListeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListeButtonActionPerformed

    private void TitleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleButtonActionPerformed
        // TODO add your handling code here:
    	System.out.println("Ajout d'un titre");
    	Title title = new Title(this.noteModel.getLastPosition() + 1, this.noteModel.getLastTitleLevel());
    	this.noteModel.addContent(title);
    	notePanel = updateNoteContent();
    	
    }//GEN-LAST:event_TitleButtonActionPerformed

    private void ParagraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParagraphButtonActionPerformed
    	System.out.println("Ajout d'un paragraph");
    	Paragraph p = new Paragraph(this.noteModel.getLastPosition() + 1);
    	this.noteModel.addContent(p);
    	notePanel = updateNoteContent();
    }//GEN-LAST:event_ParagraphButtonActionPerformed

    private void BlocButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlocButtonActionPerformed
    	System.out.println("Ajout d'un bloc");
    	Bloc b = new Bloc(this.noteModel.getLastPosition() + 1, "info");
    	this.noteModel.addContent(b);
    	notePanel = updateNoteContent();
    }//GEN-LAST:event_BlocButtonActionPerformed

    private void OpenItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    	fc.setCurrentDirectory(new File("."));
		int returnVal = fc.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			try{
			file = fc.getSelectedFile().getAbsolutePath();
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(this, 
						"Probleme fichier",
						"Erreur",
						JOptionPane.ERROR_MESSAGE);
			}
			
		}

    }//GEN-LAST:event_jTextField2ActionPerformed
    
    private void SaveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    
    private void SaveAsItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    
    private void QuitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    	System.exit(0);
    
    }//GEN-LAST:event_jTextField2ActionPerformed
    
    private void UndoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    
    private void RedoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    
    private void CutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    
    private void CopyItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    
    private void DeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BlocButton;
    private javax.swing.JButton CodeButton;
    private javax.swing.JButton DrawButton;
    private javax.swing.JButton GrasButton;
    private javax.swing.JButton ImageButton;
    private javax.swing.JButton ItalicButton;
    private javax.swing.JButton ListeButton;
    private javax.swing.JButton ParagraphButton;
    private javax.swing.JButton SoulignButton;
    private javax.swing.JButton SurlignButton;
    private javax.swing.JButton TitleButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem OpenItem;
    private javax.swing.JMenuItem SaveItem;
    private javax.swing.JMenuItem SaveAsItem;
    private javax.swing.JMenuItem QuitItem;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel notePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane noteScrollPane;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTree jTree1;
    private JComponent lastComponentAdded;
    // End of variables declaration//GEN-END:variables
    
    private ArrayList<JTextField> fields;
    
    
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public JPanel updateNoteContent(){
		try {
			pe.export(app);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i=0; i<6;i++){
        	numerotationTitle[i] = 0;
        }
		notePanel.removeAll();
        notePanelLayout=new javax.swing.GroupLayout(notePanel);
        //javax.swing.GroupLayout notePanelLayout = new javax.swing.GroupLayout(notePanel);
        notePanel.setLayout(notePanelLayout);
        notePanelLayout.setAutoCreateGaps(true);
        
        Group parallelGroup = notePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING);
        Group verticalGroup = notePanelLayout.createSequentialGroup();
        
        
        
        for (final Content c : this.noteModel.getContents()){
        	if(c instanceof Title){
        		final JTextField f = new JTextField();
        		lastComponentAdded = f;
        		f.setText(((Title) c).getName());
        		
        		f.addKeyListener(new KeyListener() {
					
					@Override
					public void keyTyped(KeyEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void keyReleased(KeyEvent arg0) {
						saveTitle(f, (Title) c);
						
					}
					
					@Override
					public void keyPressed(KeyEvent arg0) {
						// TODO Auto-generated method stub
						
					}
				});
        		if(((Title) c).getLevel() == 1){
                    parallelGroup.addGroup(notePanelLayout.createSequentialGroup()
                    	.addGap(5, 5, 5)
                    	.addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE));
                    	
              	
                    verticalGroup.addGroup(notePanelLayout.createParallelGroup()
                    	.addGap(20, 20, 20)
                    	.addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE));
        		}
        		else{
        		JButton levelDown = new JButton();
        		
        		Tools.addIcon(levelDown, "go-previous.png");
        		levelDown.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                    	downTitleLevel((Title) c);
                        
                    }
                });
        		
        		JButton levelUp = new JButton();
        		Tools.addIcon(levelUp, "go-next.png");
        		levelUp.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        upTitleLevel((Title) c);
                    }
                });
                f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                int level = ((Title) c).getLevel() -1;
                int indent = level * 20;
                for(int i=level+1; i<6;i++){
                	numerotationTitle[i] = 0;
                }
                numerotationTitle[level]++;
                String num = "";
                for(int i=1; i<=level;i++){
                	num += numerotationTitle[i] + ".";
                }
                JLabel number = new JLabel(num);
                number.setFont(new Font("arial", Font.BOLD, 18));
                parallelGroup.addGroup(notePanelLayout.createSequentialGroup()
                	.addGap(indent, indent, indent)
                	.addComponent(levelDown)
                	.addComponent(number)
                	.addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(levelUp));
                	
          	
                verticalGroup.addGroup(notePanelLayout.createParallelGroup()
                	.addGap(20, 20, 20)
                	.addComponent(levelDown)
                	.addComponent(number)
                	.addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(levelUp));
                
                if(level == 1){
                	levelDown.setVisible(false);
                }
                
                if(level == 5){
                	levelUp.setVisible(false);
                }
        		}   	
        	}
        	
        	else if(c instanceof Paragraph){
        		HTMLEditorKit editorkit = new HTMLEditorKit();
        		final JTextPane textArea = new JTextPane();
        		lastComponentAdded = textArea;
        		textArea.setContentType("text/html");
        		textArea.setEditable (true);
        		textArea.setEditorKit(editorkit);
//        		JScrollPane scrollPane = new JScrollPane( textArea );
        		textArea.setText(((Paragraph) c).getText());
        		textArea.addFocusListener(new FocusListener() {
					
					@Override
					public void focusLost(FocusEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void focusGained(FocusEvent e) {
						setActiveEditor(textArea);
						
					}
				});
        		textArea.addKeyListener(new KeyListener() {
					
					@Override
					public void keyTyped(KeyEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void keyReleased(KeyEvent arg0) {
						saveParagraph(textArea, (Paragraph) c);
						
					}
					
					@Override
					public void keyPressed(KeyEvent arg0) {
						// TODO Auto-generated method stub
						
					}
				});
        		
        		
        		if(c instanceof Bloc){
        			textArea.setBackground(((Bloc) c).getColor());
        			 final JComboBox typeComboBox = new JComboBox();
        			 typeComboBox.setModel(new javax.swing.DefaultComboBoxModel(Bloc.getTypes()));
        			 typeComboBox.setSelectedItem(((Bloc) c).getType());
        			 typeComboBox.addActionListener(new java.awt.event.ActionListener() {
        		            public void actionPerformed(java.awt.event.ActionEvent evt) {
        		            	((Bloc) c).setType((String) typeComboBox.getSelectedItem());
        		            	textArea.setBackground(((Bloc) c).getColor());
        		            }
        		        });
        			 parallelGroup.addGroup(notePanelLayout.createSequentialGroup()
        	                	.addComponent(typeComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE));
        	                	
        	          	
        	                verticalGroup.addGroup(notePanelLayout.createSequentialGroup()
        	                	.addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        	                	
        			 
        		}
//        		textArea.firePropertyChange(arg0, arg1, arg2);
        		textArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                parallelGroup.addGroup(notePanelLayout.createSequentialGroup()
                	.addGap(10, 10, 10)
                	.addComponent(textArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE)
                	.addGap(10, 10, 10));
                	
          	
                verticalGroup.addGroup(notePanelLayout.createSequentialGroup()
                	.addGap(20, 20, 20)
                	.addComponent(textArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
                	
        	}
        	
        	else if(c instanceof Image){
        		
        		JLabel img = new JLabel(((Image) c).getImage());
        		parallelGroup.addGroup(notePanelLayout.createSequentialGroup()
                    	.addGap(10, 10, 10)
                    	.addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE)
                    	.addGap(10, 10, 10));
                    	
              	
                verticalGroup.addGroup(notePanelLayout.createSequentialGroup()
                	.addGap(20, 20, 20)
                	.addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
                	
        	}
        }
        
        
        notePanelLayout.setHorizontalGroup(parallelGroup);
        notePanelLayout.setVerticalGroup(verticalGroup);
        
        SwingUtilities.invokeLater(new Runnable() {
  		  public void run() {
  			  lastComponentAdded.requestFocus();
  		  }
  		});
        
        
        //Scroll to the end of the panel to see the new component
        Rectangle visible = notePanel.getVisibleRect();
        Rectangle bounds = notePanel.getBounds();
        visible.y = bounds.height;
        notePanel.scrollRectToVisible(visible);
        
        
        noteScrollPane.getVerticalScrollBar().setUnitIncrement(16);
		return notePanel;

	}

	private void setActiveEditor(JTextPane textArea) {
		Action a = textArea.getActionMap().get("font-bold");
		if (a != null){
			this.GrasButton.setAction(a);
			GrasButton.setText("");
			GrasButton.setIcon(new ImageIcon(Tools.getPathToIcons("format-text-bold.png")));
		}
			
		a = textArea.getActionMap().get("font-italic");
		if (a != null){
			this.ItalicButton.setAction(a);
			ItalicButton.setText("");
			ItalicButton.setIcon(new ImageIcon(Tools.getPathToIcons("format-text-italic.png")));
		}
		
		a = textArea.getActionMap().get("font-underline");
		if (a != null){
			this.SoulignButton.setAction(a);
			SoulignButton.setText("");
			SoulignButton.setIcon(new ImageIcon(Tools.getPathToIcons("format-text-underline.png")));
		}
		
	}

	public Note getNoteModel() {
		return noteModel;
	}

	public void setNoteModel(Note noteModel) {
		this.noteModel = noteModel;
	}

	protected void saveParagraph(JTextPane textArea, Paragraph p) {
		String text = textArea.getText()
						.replaceAll("\\<.*head?>","")
						.replaceAll("\\<.*html?>","")
						.replaceAll("\\<.*body?>","");
		
		p.setText(text);
		
	}

	protected void saveTitle(JTextField f, Title t) {
		t.setName(f.getText());
	}

	protected void downTitleLevel(Title c) {
		c.levelDown();
		this.noteModel.downLastTitleLevel();
        notePanel = updateNoteContent();
		
	}
	
	protected void upTitleLevel(Title c) {
		c.levelUp();
		this.noteModel.upLastTitleLevel();
        notePanel = updateNoteContent();
		
	}
	
}
