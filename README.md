# Bug with ModelMapper

This project demonstrate how to reproduce a bug with ModelMapper

## How to run the project

The project is a simple Maven project with Java 11

The test framework is JUnit 5 and AssertJ

The test demonstrates the bug.

## Analysis

- Have a list of some `SourceType` -> mappings of elements of that list get added to `MappingContextImpl.sourceToDestination`
- Have another property of that `SourceType` that is equal to any element of the list -> the property of the `DestinationType` gets added to `MappingContextImpl.intermediateDestination`
- Have another property of that `SourceType` that is NOT equal to any other element of the list -> in method `MappingContextImpl.getParentDestination`, `intermediateDestination` is searched for any instance of DestinationType. The first instance found is returned
- the properties of the returned instance are updated with properties of the source instance, thus corrupting other fields of `DestinationType` that use that instance.
