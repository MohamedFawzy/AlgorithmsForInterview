<?php
/**
 * Given a robot with the energy regeneration ability
described above, the mass of the robot m and a sequence of threedimensional
co-ordinates that the robot needs to traverse, how would
you determine the minimum battery capacity needed for the robot to
complete the trajectory? (Assume the robot starts with a ull charged
battery and the battery is used ∞丑 for ove臼主 mi丑飞 gravity.)
 * @author mohamed fawzy
 * @copyright GPL
 *
 */


function batteryCapacity(array $h){
    if(count($h) < 2){
        return 0;
    }

    $min = (double) $h[0];
    $result = (double) 0;
    for($i=1; $i< count($h); $i++){
        if($h[$i] - $min > $result){
            $result = $h[$i] - $min;
        }
        if($min > $h[$i]){
            $min = $h[$i];
        }
    }
    return $result;
}


