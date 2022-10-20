# kata-wellformed
Coding kata for determining whether an input string is well-formed.

## Context
'Well-formed' means properly nested pairs of brackets such as: `{}`, `[]`, `()`, `{(){}}`, `{{[()]}}` or `([{}])`.  
Not well-formed examples would be: `{`, `{]`, or `({[)`  
So every opening bracket should have a correctly nested corresponding closing bracket of the same type.

## Task
Define a function which checks whether an input String containing only brackets is well-formed.  
Input values are assumed not to contain any characters other than `{}[]()`.  
An empty String is not well-formed.
