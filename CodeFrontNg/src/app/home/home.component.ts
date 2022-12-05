import { Component } from '@angular/core';
import {  OnInit } from '@angular/core';
import { Form } from '@angular/forms';
import { CatalogueService } from '../services/catalogue.service';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  
  
  constructor(private catalService : CatalogueService){};
  ngOnInit(): void {
      
  }
  public produitsFiltred : any ;

  onChercher(value : any)
  {
    
    this.catalService.getProductsByCateg(value.Keyword).subscribe(data=>{

      this.produitsFiltred = data;
      console.log(this.produitsFiltred);
    },err=>{
      console.log(err);
    });

    console.log(value);
  }

  
 
}
