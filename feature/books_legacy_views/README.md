# feature:books_legacy_views

Feature module focused on displaying a list of books fetched from a remote API using the traditional Android View system.

This module serves as a reference implementation for building list-based screens with legacy Views while keeping performance, readability, and maintainability in mind.

## Purpose

The purpose of this module is to demonstrate how to implement a books list screen using the classic Android UI toolkit and well-established patterns.

It is intended to show:

- How to render remote data efficiently using `RecyclerView`
- How to structure item rendering for good scrolling performance
- How to update lists safely using `ListAdapter` and `DiffUtil`
- How to keep UI code simple and maintainable with `DataBinding`
- How to connect asynchronous data streams to the UI using Kotlin coroutines and flows

## What this module showcases

- A feature screen built with Android Views instead of Jetpack Compose
- Remote data consumption from an API
- Efficient list rendering for large or changing datasets
- Clear separation between UI state and rendering logic
- A pragmatic legacy-views approach that can still be used in production codebases

## Tech stack

```
- RecyclerView
- ConstraintLayout
- ListAdapter
- DiffUtil
- DataBinding
- Kotlin Coroutines
- Kotlin Flow
```

## Why `legacy_views`?

This module exists to document and preserve good practices for teams or projects that still rely on the View system.

Even in modern Android codebases, legacy View-based screens are still common. This feature demonstrates that they can be implemented with solid architecture and performance-oriented decisions.

## Notes

- This module is intentionally focused on the View system
- The main goal is educational and referential
- Compose-based alternatives should live in a separate module for comparison