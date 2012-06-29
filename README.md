SimpleVM
========

This will be an experiment on how to have fine grained virtualization within a Virtual Machine. It is all not very well tested. Just looking to get some kind of proof of concept.

The current revision is released under BSD Licence. This may change once I got the time to think about this.

The idea is this:
The VM knows about Processes.
Each Process is single threaded.
Each Process has its own private memory.
Each Process can send and receive a Interrupt from ant to any Process.
Each Process can share memory with another Process, readwrite for the owner, readonly for the receiver.

Each Process can create child Processes.
Each parent process intercepts all signals from its child Processes. It can decide to relay them or do anything else it wants.
Each parent Process has access to it's childrens memory shares.

This way the parent Process can sandbox its children.
