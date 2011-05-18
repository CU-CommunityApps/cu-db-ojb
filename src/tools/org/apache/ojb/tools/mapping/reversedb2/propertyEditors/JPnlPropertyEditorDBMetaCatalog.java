package org.apache.ojb.tools.mapping.reversedb2.propertyEditors;

/* Copyright 2002-2005 The Apache Software Foundation
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

import org.apache.ojb.tools.mapping.reversedb2.dbmetatreemodel.DBMetaCatalogNode;

/**
 * This is an implementation of a PropertyEditor for the DBMetaCatalogNode.
 *
 * @author <a href="mailto:bfl@florianbruckner.com">Florian Bruckner</a> 
 * @version $Id: JPnlPropertyEditorDBMetaCatalog.java,v 1.1 2007-08-24 22:17:28 ewestfal Exp $
 */
public class JPnlPropertyEditorDBMetaCatalog extends PropertyEditor
{
    
    
    /** Creates new form JPnlPropertyEditorDBMetaCatalog */
    public JPnlPropertyEditorDBMetaCatalog ()
    {
        initComponents ();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents()//GEN-BEGIN:initComponents
    {
        java.awt.GridBagConstraints gridBagConstraints;

        lblCatalogName = new javax.swing.JLabel();
        tfCatalogName = new javax.swing.JTextField();

        setLayout(new java.awt.GridBagLayout());

        lblCatalogName.setText("Catalog Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        add(lblCatalogName, gridBagConstraints);

        tfCatalogName.setEditable(false);
        tfCatalogName.setText("jTextField1");
        tfCatalogName.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(tfCatalogName, gridBagConstraints);

    }//GEN-END:initComponents

    public void setEditorTarget (PropertyEditorTarget target)
    {
        if (target instanceof DBMetaCatalogNode)
        {
            super.setEditorTarget(target);
            this.tfCatalogName.setText((String)target.getAttribute(DBMetaCatalogNode.ATT_CATALOG_NAME));
        }
        else
        {
            throw new UnsupportedOperationException("This editor can only edit DBMetaCatalogNode objects");
        }
    }    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField tfCatalogName;
    private javax.swing.JLabel lblCatalogName;
    // End of variables declaration//GEN-END:variables
    
    public class CatalogPropertyChangeListener implements java.beans.PropertyChangeListener
    {
        public void propertyChange (java.beans.PropertyChangeEvent propertyChangeEvent)
        {
            if (propertyChangeEvent.getPropertyName() == (DBMetaCatalogNode.ATT_CATALOG_NAME))
            {
                tfCatalogName.setText((String)propertyChangeEvent.getNewValue());
            }
        }        
    }
    
}