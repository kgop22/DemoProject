import { Component, NgModule} from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'World Different Langauges';
  responsestr:any;

  constructor(private httpClient: HttpClient) {}

  onSubmitEng(){
    console.log("English called");

   // this.getData();
   return this.httpClient.get("http://localhost:8080/signupProject/english", { responseType: 'text' })    
   .subscribe(     
      data=>{this.responsestr=data; 
      console.log("response:",this.responsestr);    
    });
  }

  onSubmitSpa(){
     // this.getData();
   return this.httpClient.get("http://localhost:8080/signupProject/spanish", { responseType: 'text' })    
   .subscribe(     
      data=>{this.responsestr=data; 
      console.log("response:",this.responsestr);    
    });
  }

  onSubmitHin(){
    // this.getData();
   return this.httpClient.get("http://localhost:8080/signupProject/hindi", { responseType: 'text' })    
   .subscribe(     
      data=>{this.responsestr=data; 
      console.log("response:",this.responsestr);    
    });

  }
 
  onSubmitGetUserList(){
    // this.getData();
   return this.httpClient.get("http://localhost:8080/signupProject/user/getusernames", { responseType: 'text' })    
   .subscribe(     
      data=>{this.responsestr=data; 
      console.log("response:",this.responsestr);    
    });

  } 
  
    
}
