def TowerOfHanoi(height, from_rod, to_rod, aux_rod):
    if height == 1:
        print("Move disk 1 from rod",from_rod,"to rod",to_rod)
        return
    TowerOfHanoi(height-1, from_rod, aux_rod, to_rod)
    print("Move disk",height,"from rod",from_rod,"to rod",to_rod)
    TowerOfHanoi(height-1, aux_rod, to_rod, from_rod)
         
# Driver code
height = 3
TowerOfHanoi(height, 'A', 'C', 'B') 
# A, C, B are the name of rods
