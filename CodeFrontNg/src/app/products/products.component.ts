import { Component, OnInit } from '@angular/core';
import { CatalogueService } from '../services/catalogue.service';
@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit{


  constructor(private catalService : CatalogueService) {}

  ngOnInit(): void {

  }

  public produits : any ;
  public categories : any ;
  


  getAllProducts(): void
  {
    this.catalService.getProducts().subscribe(data=>{
      this.categories = data;
    },err=>{
      console.log(err);
    });
    
  }
  onDeleteProduct(id : any)
  {
    this.catalService.DeleteProduct(id).subscribe(data=>{
    },err=>{
      console.log(err);
    });
    alert("produit supprimé");
    location.reload();
  }
  onDeleteCategory(id : any)
  {
    this.catalService.DeleteCategory(id).subscribe(data=>{
      
    },err=>{
      console.log(err);
    });
    alert("catégorie supprimée");
    location.reload();

  }

}
