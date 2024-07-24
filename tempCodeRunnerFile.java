  // HERE WE ARE CALCULATING THE GRADE
        if (percentage>85) {
            System.out.println("Grade Obtained:-- A");

        }else if (percentage>70 && percentage<86) {
            System.out.println("Grade Obtained:-- B");
            
        }else if (percentage>45 && percentage<71) {
            System.out.println("Grade Obtained:-- C");
            
        }else if (percentage>32 && percentage<46) {
            System.out.println("Grade Obtained:-- D");
        }else{
            System.out.println("Grade Obtained:-- FAIL");
        }