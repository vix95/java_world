# java_world
An app that imitates the world with balance. Using *awt* and *swing* library. Implements the *ActionListener*.

## Organism description
###### Multiply
####### Formula
*organism count / 10 + 1 - CONST*<br><br>
**Example**<br>
<table>
  <tr>
    <th>organism count</th>
    <th>CONST</th>
    <th>int</th>
    <th>chance</th>
    <th>CONST</th>
    <th>int</th>
    <th>chance</th>
    <th>CONST</th>
    <th>int</th>
    <th>chance</th>
  </tr>
  <tr>
    <td>1</td>
    <td>0</td>
    <td>1</td>
    <td><b>100.00%</b></td>
    <td>1</td>
    <td>1</td>
    <td><b>100.00%</b></td>
    <td>2</td>
    <td>1</td>
    <td><b>100.00%</b></td>
  </tr>
  <tr>
    <td>2</td>
    <td>0</td>
    <td>1</td>
    <td><b>100.00%</b></td>
    <td>1</td>
    <td>1</td>
    <td><b>100.00%</b></td>
    <td>2</td>
    <td>1</td>
    <td><b>100.00%</b></td>
  </tr>
  <tr>
    <td>3</td>
    <td>0</td>
    <td>1</td>
    <td><b>100.00%</b></td>
    <td>1</td>
    <td>1</td>
    <td><b>100.00%</b></td>
    <td>2</td>
    <td>1</td>
    <td><b>100.00%</b></td>
  </tr>
  <tr>
    <td>8</td>
    <td>0</td>
    <td>1</td>
    <td><b>100.00%</b></td>
    <td>1</td>
    <td>1</td>
    <td><b>100.00%</b></td>
    <td>2</td>
    <td>1</td>
    <td><b>100.00%</b></td>
  </tr>
  <tr>
    <td>9</td>
    <td>0</td>
    <td>1</td>
    <td><b>100.00%</b></td>
    <td>1</td>
    <td>1</td>
    <td><b>100.00%</b></td>
    <td>2</td>
    <td>1</td>
    <td><b>100.00%</b></td>
  </tr>
  <tr>
    <td>10</td>
    <td>0</td>
    <td>2</td>
    <td><b>50.00%</b></td>
    <td>1</td>
    <td>1</td>
    <td><b>100.00%</b></td>
    <td>2</td>
    <td>1</td>
    <td><b>100.00%</b></td>
  </tr>
  <tr>
    <td>20</td>
    <td>0</td>
    <td>3</td>
    <td><b>33.33%</b></td>
    <td>1</td>
    <td>2</td>
    <td><b>50.00%</b></td>
    <td>2</td>
    <td>1</td>
    <td><b>100.00%</b></td>
  </tr>
  <tr>
    <td>30</td>
    <td>0</td>
    <td>4</td>
    <td><b>25.00%</b></td>
    <td>1</td>
    <td>3</td>
    <td><b>33.33%</b></td>
    <td>2</td>
    <td>2</td>
    <td><b>50.00%</b></td>
  </tr>
  <tr>
    <td>40</td>
    <td>0</td>
    <td>5</td>
    <td><b>20.00%</b></td>
    <td>1</td>
    <td>4</td>
    <td><b>25.00%</b></td>
    <td>2</td>
    <td>3</td>
    <td><b>33.33%</b></td>
  </tr>
  <tr>
    <td>50</td>
    <td>0</td>
    <td>6</td>
    <td><b>16.67%</b></td>
    <td>1</td>
    <td>5</td>
    <td><b>20.00%</b></td>
    <td>2</td>
    <td>4</td>
    <td><b>25.00%</b></td>
  </tr>
  <tr>
    <td>60</td>
    <td>0</td>
    <td>7</td>
    <td><b>14.29%</b></td>
    <td>1</td>
    <td>6</td>
    <td><b>16.67%</b></td>
    <td>2</td>
    <td>5</td>
    <td><b>20.00%</b></td>
  </tr>
  <tr>
    <td>70</td>
    <td>0</td>
    <td>8</td>
    <td><b>12.50%</b></td>
    <td>1</td>
    <td>7</td>
    <td><b>14.29%</b></td>
    <td>2</td>
    <td>6</td>
    <td><b>16.67%</b></td>
  </tr>
  <tr>
    <td>80</td>
    <td>0</td>
    <td>9</td>
    <td><b>11.11%</b></td>
    <td>1</td>
    <td>8</td>
    <td><b>12.50%</b></td>
    <td>2</td>
    <td>7</td>
    <td><b>14.29%</b></td>
  </tr>
  <tr>
    <td>90</td>
    <td>0</td>
    <td>10</td>
    <td><b>10.00%</b></td>
    <td>1</td>
    <td>9</td>
    <td><b>11.11%</b></td>
    <td>2</td>
    <td>8</td>
    <td><b>12.50%</b></td>
  </tr>
  <tr>
    <td>100</td>
    <td>0</td>
    <td>11</td>
    <td><b>9.09%</b></td>
    <td>1</td>
    <td>10</td>
    <td><b>10.00%</b></td>
    <td>2</td>
    <td>9</td>
    <td><b>11.11%</b></td>
  </tr>
  <tr>
    <td>110</td>
    <td>0</td>
    <td>12</td>
    <td><b>8.33%</b></td>
    <td>1</td>
    <td>11</td>
    <td><b>9.09%</b></td>
    <td>2</td>
    <td>10</td>
    <td><b>10.00%</b></td>
  </tr>
</table>

**grass** - CONST: 1
<br>
**muschroom** - CONST: -20; 100% chance after kill another organism; dying after 10 moves; can spawn everytime
<br>
**sheep** - 30% chance when meet another sheep
<br>
**wolf** - 25% chance when meet another wolf

###### Actions
**grass** - nothing
<br>
**mushroom** - kill another organism when they meet
<br>
**sheep** - nothing
<br>
**wolf** - aim to sheep when sheep population is greater than 20 pieces, get extra one move

#### java_world.java
Set world board size given in px - x, y. The autoscaler of the board is implemented. Can pass another size.

#### MyFrame.java
Create the form. Parameters *WIDTH* and *HEIGHT* sets form size.

#### RightClickMouse.java
Mouse clicked event. Add organism from the context menu.

#### ContextMenu.java
Define organisms on context menu.

#### Organism.java
Main class that contains parameters of all organisms.

#### Animal.java, Plant.java, ...
Extends Organism.java. Specified actions for group of organism.

#### Grass.java, Sheep.java, ...
Extends Animal.java or Plant.java. Specified actions for any kind of organism.

#### World.java
Defined java world! Parameters:
*size* - size of world
*organismArray* - array of organism at world
*myFrame* - form

Also exists *addOrganism* and *drawWorld* method.

*drawWorld* method is responsible for clear the world board and sets organism on board.

#### Coordinates.java
Class exists coordinates of organisms or world size. Contains *equals* method.

#### Board.java
Board on form. Sets grid layout. Sets labels on board, clear board.

#### BoardArea.java
Extends JPanel. Area on board. Coloring organisms, set label method and clear label method. Contains all Board operations.

#### WorldBoard.java
Extends World.java.

#### NewOrganism.java
Implements ActionListener. Creating virtual/temp organism.