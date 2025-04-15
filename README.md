# java-hospital-system

🔗 Linked List (PatientRecords) — Think: A Hospital Paper Trail
💭 Real Life Analogy:
A nurse keeps a stack of patient files. To add a new patient, she just puts the file on top of the pile. If she wants to look through all patients, she flips through one file at a time.

🧠 Code Logic:
We created a Node that stores a Patient object and a reference to the next node (like a pointer to the next file).

The head is like the first file on top.

addPatient() adds a patient to the front (like stacking a file on top).

displayAll() goes through each file one-by-one (while-loop using .next).

✅ You Should Know:
We used Singly Linked List, so we only go forward.

This is great for adding/removing patients without resizing like an array.

🏥 Priority Queue (EmergencyQueue) — Think: Emergency Room Triage
💭 Real Life Analogy:
Patients don’t get treated in the order they arrive — the ones bleeding out go first. That’s what the priority does.

🧠 Code Logic:
Java’s PriorityQueue sorts automatically based on the priority number (lower number = higher priority).

We made EmergencyPatient class implement Comparable so it knows how to sort based on priority.

When we enqueue(), we're adding patients with their severity level.

treatNext() treats whoever is most critical first.

✅ You Should Know:
This mimics real hospital emergency handling.

It’s automatic sorting based on priority.

💊 Stack (MedicalHistory) — Think: Medical Journal
💭 Real Life Analogy:
Imagine a notepad where the last note you wrote is always on top. If a doctor wants to know the last treatment, they just peek at the top page.

🧠 Code Logic:
We used Stack<String> to store treatment records.

push() adds treatment to the top.

peek() shows the last treatment (top of the stack).

displayHistory() just shows all notes in reverse order (LIFO = Last In First Out).

✅ You Should Know:
Perfect for things where history matters, like browser history, undo actions, or treatment logs.

🧑‍⚕️ Hash Table (DoctorAssignments) — Think: Quick Look-up Board
💭 Real Life Analogy:
Receptionist has a chart with doctor IDs, and she can quickly find who’s on duty by checking the doctor’s ID.

🧠 Code Logic:
We used HashMap<Integer, Doctor> to store doctor info using their ID.

.put() adds a doctor.

.get() fetches doctor by ID.

.values() gives us all doctors to display.

✅ You Should Know:
Hash maps are super fast for finding stuff when you know the key (doctor ID here).

This is similar to a database index — fast, efficient, and perfect for quick lookup.

🧪 Main.java — This is Your Test Lab
This file connects all classes and runs them.

You create objects, call methods like addPatient() or treatNext(), and print results.
