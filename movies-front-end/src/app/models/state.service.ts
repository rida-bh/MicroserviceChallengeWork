export enum dataStateEnum{
  LOADING,
  LOADED,
  ERROR
}
export interface AppDataState<T>{
  dataState?:dataStateEnum,
  data?:T,
  errMessage?:string
}
