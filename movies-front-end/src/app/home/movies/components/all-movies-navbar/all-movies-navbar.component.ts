import {Component, EventEmitter, Output} from '@angular/core';

@Component({
  selector: 'app-all-movies-navbar',
  templateUrl: './all-movies-navbar.component.html',
  styleUrls: ['./all-movies-navbar.component.css']
})
export class AllMoviesNavbarComponent {
  @Output() listViewClicked = new EventEmitter<void>();
  @Output() gridViewClicked = new EventEmitter<void>();

  showListView() {
    this.listViewClicked.emit();
  }

  showGridView() {
    this.gridViewClicked.emit();
  }
}
