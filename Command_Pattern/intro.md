- Decouple things that are tighly coupled
- isolated changes are possible 

Takes an operation, wraps in an object, sends the object out to the system, the system executes the object.
*Need to know the communication protocal for the command pattern*

---

Problems without this approach: If objects have to communicate among themselves, we need instances and names of methods for both to work. But if we change the names of the methods the other person does not know. So we can pass an object that executes a bunch of methods.

---

