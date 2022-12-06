import { Component, inject, OnInit } from '@angular/core';
import { CatalogueService } from '../services/catalogue.service';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

 

  constructor(private catalService : CatalogueService){};

  ngOnInit(): void {
      
  }

  public AddProd(value : any)
  {
    this.catalService.addProduct(value.categName,value.productName,value.Productquantity).subscribe(data =>{
      alert ("Produit ajoutée");
    },err=>{
      console.log(err);
    });
  }

}


