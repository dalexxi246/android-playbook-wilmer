# Wilmer Android Playbook

A modern Android reference app and experimentation lab for architecture patterns, feature recipes, SDK updates, and production-grade best practices.

## Why this project exists

This repository is my personal Android playground and reference lab.

I built it with three goals in mind:

- Keep a curated, reusable codebase with the best practices I’ve learned over the years.
- Provide junior developers with practical examples of patterns and recipes for common and complex use cases.
- Stay up to date with modern Android development by testing new SDK features, APIs, and architectural approaches in a real project.

## What you will find here

This project is not a single-purpose app.  
It is a living Android laboratory that combines:

- Architecture patterns
- Feature-based modularization
- UI and state management recipes
- Testing strategies
- Experiments with new Android APIs
- Practical implementation examples for real-world scenarios

## Project goals

- Showcase clean, maintainable, production-oriented Android code
- Document architectural decisions and trade-offs
- Serve as a quick reference when implementing complex features
- Explore modern Android recommendations in a hands-on way
- Evolve continuously as the Android ecosystem changes

## Tech stack

- Kotlin
- Jetpack Compose
- Android Jetpack libraries
- Coroutines / Flow
- ViewModel
- Navigation
- Room
- DataStore
- WorkManager
- App Startup
- Splash Screen
- Retrofit or Ktor
- Hilt or manual DI
- JUnit / Turbine / Mocking tools
- Macrobenchmark / Baseline Profiles

> The exact stack may evolve over time as new APIs and patterns prove valuable.

## Module structure

```text
:app -> Aggregator module with main App launcher and navigation to feature modules
:core:ui
:core:model
:core:common
:core:network
:core:database
:core:datastore
:core:testing
:domain
:feature:home
:feature:recipes
:feature:labs
:feature:settings
:sync
:benchmark
:build-logic
```

## Repository sections

```
feature:recipes
```

Focused examples for common implementation scenarios, such as:
	•	Pagination
	•	Error handling
	•	Form validation
	•	Offline-first flows
	•	Permissions
	•	Navigation patterns
	•	Search flows
	•	Loading and empty states
	•	Testing patterns
## Architecture principles

This project follows a few simple principles:
	•	UI should be reactive and state-driven
	•	Features should be isolated by responsibility
	•	app should assemble dependencies, not contain business logic
	•	Shared concerns belong in core
	•	Abstractions should exist only when they add clarity
	•	Modularity should help maintainability, not create unnecessary complexity

## Who this repository is for?

This project may be useful for:
	•	Android developers looking for practical architecture examples
	•	Junior developers learning how to structure real apps
	•	Engineers exploring modern Android APIs
	•	Anyone who wants a curated Android reference project

## Project status

This is a living repository.
It will evolve as I continue learning, testing, and refining Android development practices.

Some modules or recipes may be experimental, incomplete, or intentionally iterative.

## How to explore this repo

A good starting point is:
	1.	Check the module structure
	2.	Open feature:recipes for focused examples
	3.	Open feature:labs for experiments
	4.	Review docs/ for architectural notes
	5.	Inspect tests to understand expected behavior and implementation trade-offs

## Design philosophy

This repository favors:
	•	clarity over cleverness
	•	consistency over novelty
	•	practical patterns over theoretical purity
	•	explicit trade-offs over dogma

## Contributing

This is primarily a personal reference project, but suggestions, discussions, and improvements are welcome.

## Author

Wilmer Hurtado

**Senior Android Engineer** focused on building modern, scalable, and maintainable mobile applications.

---
# AndroidPatternsLab

A modern Android reference app and experimentation lab that showcases architecture patterns, feature recipes, SDK updates, and production-grade best practices.

## Overview

AndroidPatternsLab is a personal repository built to:

- keep a reusable Android code reference
- help junior developers learn through practical examples
- experiment with new Android APIs and platform changes
- validate architectural ideas in a real modular project

## Contents

- Feature-based modularization
- Architecture and state management patterns
- UI recipes with Jetpack Compose
- Testing examples
- Offline-first and sync strategies
- Performance and benchmarking experiments
- SDK and platform update explorations

## Modules

```text
:app
:core:ui
:core:model
:core:common
:core:network
:core:database
:core:datastore
:core:testing
:domain
:feature:recipes
:feature:labs
:feature:settings
:sync
:benchmark
:build-logic
```

## Principles
- reactive UI
- modular by feature
- shared concerns in core modules
- clear boundaries
- minimal unnecessary abstraction
- production-minded code

# Purpose

This is not just a demo app.
It is a living Android lab for learning, teaching, and staying current with the platform.

# Author

Wilmer

