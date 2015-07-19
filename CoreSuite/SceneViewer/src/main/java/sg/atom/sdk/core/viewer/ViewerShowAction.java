/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.atom.sdk.core.viewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Edit",
        id = "sg.atom.sdk.core.viewer.ViewerShowAction"
)
@ActionRegistration(
        displayName = "#CTL_ViewerShowAction"
)
@ActionReference(path = "Menu/View", position = 0)
@Messages("CTL_ViewerShowAction=Show viewer")
public final class ViewerShowAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
