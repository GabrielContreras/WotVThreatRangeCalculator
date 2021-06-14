# WotVThreatRangeCalculator
Visual display of threat range a character in War of the Visions has when placed in a specified map.

Each character in war of the visions has what can be considered a potential threat range. This is usually calculated by their movement range plus the range of their furthest reaching skill. However, there are other variations that affect this calculation that make it difficult for a player to calculate the threat range internally in the provided 30 second time window each turn.

The following is considered when calculating threat range:
1. Distance
2. Height of target
3. Height of user
4. User's movement
5. User's jumping capabilities
5. User's skill range 
6. User's skill range height
7. (Optional) Range height of area of affect abilities 
8. (Optional) Range of area of affect abilities

For example, take the following situation.

Character: Gilgamesh<br>
Movement: 3 Tiles<br>
Jump: 1 Height<br>
Furthest Skill Range: 3 Tiles<br>
Furthest Skill Range Height: 1 Tile<br>
Furthest Skill area of effect (AoE) range: 2 Tiles<br>
Furthest Skill area of effect (AoE) range height: 2 Tiles<br>

With the above, the further potential threat range is: 3 (Movement) + 3 (Range) + 2 (AoE Range) = 8.

However, when taking into consideration the height of the target and the height differences of the map and the target, this value can lesson significantly.

Maps in WotV usually have tiles in a three-dimensional space that usually follow the following range,

X <= 15<br>
Y <= 15<br>
Z <= 6<br>


The current progress of this project is below:
1. Create Java program to run threat range calculations given a specified map and specified character
2. Design and attach SQL database to hold data on each character that exists in the game.
3. Create GUI to simplify usage of program and improve visualization of calculated threat range

In the future the goal is to host this program as a web app.
