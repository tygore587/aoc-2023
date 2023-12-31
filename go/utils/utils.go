package utils

import (
	"bufio"
	"os"
)

// stolen from https://stackoverflow.com/questions/5884154/read-text-file-into-string-array-and-write
func ReadLines(path string) ([]string, error) {
	file, err := os.Open(path)
	if err != nil {
		return nil, err
	}
	defer file.Close()

	var lines []string
	scanner := bufio.NewScanner(file)
	for scanner.Scan() {
		lines = append(lines, scanner.Text())
	}
	return lines, scanner.Err()
}
