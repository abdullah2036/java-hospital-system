# Java Hospital System

A console simulation of a hospital's filing system, built to practise **object-oriented programming** and to show **which data structure fits which job**: patient records, an emergency room triage queue, treatment histories and doctor lookups each use a different structure.

*University team project.*

## Data structures used

| Component | Structure | Why it fits |
|---|---|---|
| `PatientRecords` | **Singly linked list** (hand-written `Node`) | constant-time insertion of new patients at the head |
| `EmergencyQueue` | **Priority queue** (`PriorityQueue` + `Comparable`) | the most urgent patient is always treated next (1 = high, 3 = low) |
| `TreatmentHistory` | **Stack** (`Stack<String>`) | the latest treatment is always on top (`peek`) |
| `DoctorAssignments` | **Hash map** (`HashMap<Integer, Doctor>`) | constant-time lookup of a doctor by ID |

## Sample output

`Main.java` walks through each component:

```text
ID: 102, Name: Ali, Age: 40, Contact: 4564646400
ID: 101, Name: Ahmed, Age: 25, Contact: 45466464664
Treating: Ali [Priority: 1]
Treatment History:
- Surgery on 2025-02-01
- Antibiotics
Last Treatment: Antibiotics
ID: 201, Name: Dr. Khalid, Dept: Cardiology, Schedule: 9AM-5PM
ID: 202, Name: Dr. Sara, Dept: Neurology, Schedule: 10AM-6PM
```

Ali is treated first even though Ahmed arrived first, because Ali's priority (1) is higher.

## Run it

Requires a JDK (8 or newer).

```bash
git clone https://github.com/abdullah2036/java-hospital-system.git
cd java-hospital-system/Hospital
javac -d bin src/*.java
java -cp bin Main
```

Or open the `Hospital` folder in VS Code with the Java Extension Pack and run `Main.java`.

## Project structure

```
Hospital/
└── src/
    ├── Main.java               demo that exercises every component
    ├── Patient.java            patient entity (id, name, age, contact, treatment history)
    ├── PatientRecords.java     linked list of patients
    ├── EmergencyQueue.java     priority queue for triage
    ├── TreatmentHistory.java   stack of treatments per patient
    ├── Doctor.java             doctor entity (id, name, department, schedule)
    └── DoctorAssignments.java  hash map of doctors by id
```

## Tech stack

Java · Java Collections Framework (`PriorityQueue`, `Stack`, `HashMap`)

---

Built by **Abdullah Bokhary** · [Portfolio](https://abdullah.pageui.workers.dev/) · [LinkedIn](https://www.linkedin.com/in/abdullah-bokhary-840315326/) · [GitHub](https://github.com/abdullah2036)
