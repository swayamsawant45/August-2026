//============================================================================
// Name        : 4.cpp
// Author      : Swayam
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char *argv[]) {

    /* ---- Step 1: Check argument count ---- */
    if (argc != 4) {
        printf("Usage  : %s <warn_threshold> <critical_threshold> <num_readings>\n", argv[0]);
        printf("Error  : Missing arguments.\n");
        return 1;
    }

    /* ---- Step 2: Convert string arguments to integers ---- */
    int warn_threshold     = atoi(argv[1]);
    int critical_threshold = atoi(argv[2]);
    int num_readings       = atoi(argv[3]);

    /* ---- Step 3: Validate the values ---- */
    if (warn_threshold >= critical_threshold) {
        printf("Error  : warn_threshold must be less than critical_threshold.\n");
        return 1;
    }

    if (num_readings < 1 || num_readings > 500) {
        printf("Error  : num_readings must be between 1 and 500.\n");
        return 1;
    }

    /* ---- Step 4: Print configuration summary ---- */
    printf("Config : Warn=%d\xC2\xB0" "C  Critical=%d\xC2\xB0" "C  Readings=%d\n",
           warn_threshold, critical_threshold, num_readings);

    /* ---- Step 5: Simulate readings and classify them ---- */
    srand((unsigned int) time(NULL));   /* seed once, so numbers differ each run */

    int normal_count   = 0;
    int warning_count  = 0;
    int critical_count = 0;
    int shutdown_count = 0;

    /* Assumption: Shutdown = far beyond critical (critical + 15).
       Adjust this rule if your assignment defines it differently. */
    int shutdown_threshold = critical_threshold + 15;

    for (int i = 0; i < num_readings; i++) {
        int temp = rand() % 70;   /* random value in range 0-69 */

        if (temp >= shutdown_threshold) {
            shutdown_count++;
        } else if (temp >= critical_threshold) {
            critical_count++;
        } else if (temp >= warn_threshold) {
            warning_count++;
        } else {
            normal_count++;
        }
    }

    /* ---- Step 6: Print results summary ---- */
    printf("Results: Normal:%d  Warning:%d  Critical:%d  Shutdown:%d\n",
           normal_count, warning_count, critical_count, shutdown_count);

    return 0;
}
