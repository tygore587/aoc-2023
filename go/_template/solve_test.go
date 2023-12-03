package solve

import (
	"aoc23/go/utils"
	"fmt"
	"log"
	"testing"

	"github.com/stretchr/testify/assert"
)

const expected_example_result_1 = 0

func TestSolve1(t *testing.T) {
	assert := assert.New(t)

	input_example, err_example := utils.ReadLines("input_1_example.txt")

	if err_example != nil {
		log.Fatalf("Error while reading example inputs: %s", err_example)
	}

	actual_example_result := Solve1(input_example)

	assert.Equal(expected_example_result_1, actual_example_result)

	fmt.Println("Example input worked for part 1!")

	input, err := utils.ReadLines("input_1.txt")

	if err != nil {
		log.Fatalf("Error while reading input: %s", err_example)
	}

	actual_result := Solve1(input)

	fmt.Printf("Result for part 1 is %d.\n", actual_result)
}

const expected_example_result_2 = 0

func TestSolve2(t *testing.T) {
	assert := assert.New(t)

	input_example, err := utils.ReadLines("input_2_example.txt")

	if err != nil {
		log.Fatalf("Error while reading input examples: %s", err)
	}

	actual_example_result := Solve2(input_example)

	assert.Equal(expected_example_result_2, actual_example_result)

	fmt.Println("Example input worked for part 1!")

	input, err := utils.ReadLines("input_2.txt")

	if err != nil {
		log.Fatalf("Error while reading input: %s", err_example)
	}
	
	actual_result := Solve2(input)

	fmt.Printf("Result for part 2 is %d.\n", actual_result)
}
