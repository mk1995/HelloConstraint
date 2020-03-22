# HelloConstraint
Android Lab exercise
Modify the activity_main.xml layout to align the Toast and Count Button elements along the left side of the show_count TextView that shows "0". Refer to the figures below for the layout.
Include a third Button called Zero that appears between the Toast and Count Button elements.
Distribute the Button elements vertically between the top and bottom of the show_count TextView.
Set the Zero Button to initially have a gray background.
Make sure that you include the Zero Button for the landscape orientation in activity_main.xml (land), and also for a tablet-sized screen in activity_main (xlarge).
Make the Zero Button change the value in the show_count TextView to 0.
Update the click handler for the Count Button so that it changes its own background color, depending on whether the new count is odd or even.
Hint: Don't use findViewById to find the Count Button. Is there something else you can use?

Feel free to to use constants in the Color class for the two different background colors.

Update the click handler for the Count Button to set the background color for the Zero Button to something other than gray to show it is now active. Hint: You can use findViewById in this case.
Update the click handler for the Zero Button to reset the color to gray, so that it is gray when the count is zero.
[![](https://github.com/mk1995/HelloConstraint/blob/master/HelloConstraint.gif "")](https://github.com/mk1995/HelloConstraint/blob/master/HelloConstraint.gif "") 
