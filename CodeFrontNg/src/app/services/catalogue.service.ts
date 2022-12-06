import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {HttpParams} from "@angular/common/http";
@Injectable({
  providedIn: 'root'
})
export class CatalogueService {

  public port : string = "http://localhost:8080"
  constructor(private httpClient : HttpClient) { }

  public getCategories() 
  {
    return this.httpClient.get(this.port + "/Categories");
  }
  public getProducts() 
  {
    return this.httpClient.get(this.port + "/Categories");
  }
  public getProductsByCateg(aux : any) 
  {
    return this.httpClient.post(this.port + "/FindByCategory/"+aux,null)
  }
  public addCategory(aux : any) 
  {
    return this.httpClient.post(this.port + "/Categorie/",{name : aux })
  }
  public addProduct(aux1 : any,aux2 : any,aux3 : any) 
  {
    return this.httpClient.post(this.port + "/Produit/"+aux1,{name : aux2 , quantité : aux3} )
  }
  public DeleteProduct (aux : any)
  {
    return this.httpClient.post(this.port+ "/deleteProduit/"+aux,null);
  }
  public DeleteCategory (aux : any)
  {
    return this.httpClient.post(this.port+ "/deleteCategorie/"+aux,null);
  }

}