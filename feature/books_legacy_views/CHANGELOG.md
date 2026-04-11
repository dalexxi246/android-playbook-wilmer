# Changelog

All notable changes to `feature:books_legacy_views` will be documented in this file.

The goal of this changelog is not only to track changes, but also to document the architectural evolution of the feature for learning purposes.

## [1.0.0] - Baseline implementation
### Added
- Basic books list screen using RecyclerView
- Simple RecyclerView.Adapter implementation
- Basic MVVM setup 
- ViewModel exposing list content through Flow
- Basic repository implementation with an offline, hardcoded list of books.

### Notes
- This version prioritizes clarity and accessibility for junior developers.
- Adapter updates still rely on full refreshes.
