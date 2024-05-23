/*
 * This is a program prints out stars
 *
 * @author  Ava Venturino
 * @version 1.0
 * @since   2024-01-01
 */

import { createPrompt} from 'bun-promptx'

function firstTriangle(starNumber: number) {
    let line = ""
    if (starNumber > 1) {
        line = `*`.repeat(starNumber)
        console.log(line)
        firstTriangle(starNumber - 1)
    } else if (starNumber == 1) {
        line = "*"
        console.log(line)
    }
}

function secondTriangle(starNumber: number, counter: number) {
    let line = ``
    if (counter == 1) {
        line = `*`
        console.log(line)
        secondTriangle(starNumber, counter + 1)
    } else if (counter <= starNumber) {
        line = `*`.repeat(counter)
        console.log(line)
        secondTriangle(starNumber, counter + 1)
    }
}

console.log("Hourglass star pattern program.")
const integerInput: number = createPrompt("Enter a number: ").value

if (isNaN(integerInput) || integerInput < 0) {
    console.log("Invalid Input. Try using a positive number")
} else {
    let counter: number = 1
    firstTriangle(integerInput)
    secondTriangle(integerInput, counter)
}
console.log("\nDone.")
