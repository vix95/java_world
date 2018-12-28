# java_world
An app that imitates the world with balance. Using *awt* and *swing* library. Implements the *ActionListener*.

## java_world.java
Set world board size given in px - x, y. The autoscaler of the board is implemented. Can pass another size.

## MyFrame.java
Create the form. Parameters *WIDTH* and *HEIGHT* sets form size.

## RightClickMouse.java
Mouse clicked event. Can add organism from the context menu.

## ContextMenu.java
Define organisms on context menu.

## Organism.java
Main class that contains parameters of all organisms.

## Animal.java, Plant.java
Extends Organism.java. Specified actions for group of organism.

## Grass.java, ...
Extends Animal.java or Plant.java. Specified actions for any kind of organism.

## World.java
Defined java world! Parameters:
*size* - size of world
*organismArray* - array of organism at world
*myFrame* - form

Also exists *addOrganism* and *drawWorld* method.

*drawWorld* method is responsible for clear the world board and sets organism on board.

## Coordinates.java
Class exists coordinates of organisms or world size. Contains *equals* method.

## Board.java
Board on form. Sets grid layout. Sets labels on board, clear board.

## BoardArea.java
Extends JPanel. Area on board. Coloring organisms, set label method and clear label method. Contains all Board operations.

## WorldBoard.java
Extends World.java.

## NewOrganism.java
Implements ActionListener. Creating virtual/temp organism.