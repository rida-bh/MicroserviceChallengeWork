export class Movie {
  idMovie?: number;
  title?: string;
  description?: string;
  posterUrl?: string;
  durationInMin?: number;
  releaseDate?: string;
  country?: string;
  experience?: Experience;
  language?: Language;
  type?: Type;
}

export class Experience {
  idExperience?: number;
  name?: string;
}

export class Language {
  idLanguage?: number;
  name?: string;
}

export class Type {
  idType?: number;
  name?: string;
}

export class MovieResponse {
  currentPage?: number;
  totalPages?: number;
  pageSize?: number;
  movies?: Movie[];
}
