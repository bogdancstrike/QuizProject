module lib {

    //modulele care vor avea nevoie de lib, vor avea nevoie si de java.rmi ; un fel de "cascadare"
    requires transitive java.rmi;

    exports lib.service;
    exports lib.event;
    exports lib.model;
}