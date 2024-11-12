# Java logical expressions

## Description

In this exercise, we will look at some complex logical expressions.

## Tasks

### Evaluate expressions

Examine the following pairs of expressions and decide if they are the same. Write down the full truth tables for each expression 

*While there's no need to actually write code for this exercise feel free to do so if you want to test your answers.*

Expression 1 | Expression 2
--- | ---
`!A && B` | `B && !A`
`!A \|\| B` | `B \|\| !A`
`!(A && B)` | `A \|\| B`
`A && B \|\| C` | `A && (B \|\| C)`
`(A && B \|\| C)` | `!(A \|\| B && C)`


### Complex expressions
Examine the following pairs of expressions and decide if they are the same. Write down the full truth tables for each expression

*While there's no need to actually write code for this exercise feel free to do so if you want to test your answers.*

Expression 1 | Expression 2
--- | ---
`!(A == B)` | `A != B`
`!((A == B) \|\| (A == C))` | `(A != B) && (A != C)`
`!((A == B) &&  (C > D))` | `(A != B) \|\| (C <= D)`