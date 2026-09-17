
public class Program {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[100];
		int count = 0;
		
		int choice;
		
		int current=0;
		
		
		do {
			System.out.println("\n--- Main Menu ---");
		    System.out.println("1. Add Employee");
		    System.out.println("2. Display");
		    System.out.println("3. Sort");
		    System.out.println("4. Save");
		    System.out.println("5. Load");
		    System.out.println("6. Exit");
		    
		    System.out.println("Enter your choice:");
		    choice = ConsoleInput.getInt();
		     
				switch(choice) 
				{
					case 1: 
						System.out.println("Add selected");
						
						do {
							System.out.println("\n--- Add Employee ---");
						    System.out.println("1. Manager");
						    System.out.println("2. Engineer");
						    System.out.println("3. Sales Person");
						    System.out.println("4. Exit to Main Menu");
						    
						    
						    System.out.println("Enter your choice:");
						    choice = ConsoleInput.getInt();
						    
						    switch(choice)
						    {
						    	
						    case 1:
						    	System.out.println("Manager selected");
						    	
						    	System.out.println("Enter Manager Name :" );
								String name = ConsoleInput.getString();
								
								System.out.println("Enter Manager Address :" );
								String address = ConsoleInput.getString();
								
								System.out.println("Enter Manager Age :");
								int age = ConsoleInput.getInt();
							
								System.out.println("Enter Manager gender :" );
								String gender = ConsoleInput.getString();
								
								System.out.println("Enter Manager basicSalary :");
								int basicSalary = ConsoleInput.getInt();
								
								System.out.println("Enter Manager HRA :");
								int hra = ConsoleInput.getInt();
								
								Manager objM =new Manager(name,address,age,gender,basicSalary,hra);
								
								employees[count] = objM;
								count++;
						    	break;
						    	
						    case 2:
						    	System.out.println("Engineer selected");
						    	
						    	System.out.println("Enter Engineer Name :" );
								String nameE = ConsoleInput.getString();
								
								System.out.println("Enter Engineer Address :" );
								String addressE = ConsoleInput.getString();
								
								System.out.println("Enter Engineer Age :");
								int ageE = ConsoleInput.getInt();
							
								System.out.println("Enter Engineer gender :" );
								String genderE = ConsoleInput.getString();
								
								System.out.println("Enter Engineer basicSalary :");
								int basicSalaryE = ConsoleInput.getInt();
								
								System.out.println("Enter Engineer OverTime :");
								int ot = ConsoleInput.getInt();
								
								Engineer objE =new Engineer(nameE,addressE,ageE,genderE,basicSalaryE,ot);
								
								employees[count] = objE;
								count++;
								
						    	break;
						    	
						    case 3:
						    	System.out.println("Sales Person selected");
						    	
						    	System.out.println("Enter SalesPerson Name :" );
								String nameS = ConsoleInput.getString();
								
								System.out.println("Enter SalesPerson Address :" );
								String addressS = ConsoleInput.getString();
								
								System.out.println("Enter SalesPerson Age :");
								int ageS = ConsoleInput.getInt();
							
								System.out.println("Enter SalesPerson gender :" );
								String genderS = ConsoleInput.getString();
								
								System.out.println("Enter SalesPerson basicSalary :");
								int basicSalaryS = ConsoleInput.getInt();
								
								System.out.println("Enter SalesPerson Comission :");
								int C = ConsoleInput.getInt();
								
								SalesPerson objS =new SalesPerson(nameS,addressS,ageS,genderS,basicSalaryS,C);
								
								employees[count] = objS;
								count++;
								
						    	break;
						    	
						    case 4:
						    	System.out.println("Returing to main menu");
						    	break;
						    	
						    default:
						    	System.out.println("Invalid choice");
						  	
						    }
						
							}while(choice != 4);
						
							break;
						
						case 2: 
							System.out.println("Display selected");
						
						do {
							System.out.println("---Display---");
							System.out.println("1.All Employees");
							System.out.println("2.First Employees");
							System.out.println("3.Next Employees");
							System.out.println("4.Previous Employees");
							System.out.println("5.Last Employees");
							System.out.println("6.Exit to Main Menu");
							
							
							System.out.println("Enter choice : ");
							choice = ConsoleInput.getInt();
							
							     
							switch(choice) {
							

							case 1: 
								System.out.println("All Employees");
								
								for(int i = 0; i< count ; i++) 
								{
									employees[i].displayInfo();
									System.out.println("-------------");
								}
								
								
								break;
								
							case 2: 
								System.out.println("First Employees");

	                            if(count > 0)
	                            {
	                                current = 0;
	                                employees[current].displayInfo();
	                                System.out.println("-------------");
	                            }
	                            else
	                            {
	                                System.out.println("No employees available");
	                            }

	                            break;
								
							case 3: 
								 System.out.println("Next Employees");

		                            if(count == 0)
		                            {
		                                System.out.println("No employees available");
		                            }
		                            else
		                            {
		                                if(current < count - 1)
		                                {
		                                    current++;
		                                    employees[current].displayInfo();
		                                    System.out.println("-------------");
		                                }
		                                else
		                                {
		                                    System.out.println("Already at last employee");
		                                }
		                            }

		                            break;
								
							case 4: 
								 System.out.println("Previous Employees");

		                            if(count == 0)
		                            {
		                                System.out.println("No employees available");
		                            }
		                            else
		                            {
		                                if(current > 0)
		                                {
		                                    current--;
		                                    employees[current].displayInfo();
		                                    System.out.println("-------------");
		                                }
		                                else
		                                {
		                                    System.out.println("Already at first employee");
		                                }
		                            }

		                            break;
								
							case 5: 
								System.out.println("Last Employees");

	                            if(count > 0)
	                            {
	                                current = count - 1;
	                                employees[current].displayInfo();
	                                System.out.println("-------------");
	                            }
	                            else
	                            {
	                                System.out.println("No employees available");
	                            }

	                            break;	
	                            
	                        case 6: 
								System.out.println("Returing to main menu");
						    	break;
								
							default:
						    	System.out.println("Invalid choice");
						    	break;
						    	
							}
							
						}while(choice != 6);
						
						choice=0;
						
						break;
						
					
						
						case 3:
						    System.out.println("Sort selected");

						    do
						    {
						        System.out.println("\n--- Sort Menu ---");
						        System.out.println("1. All Managers");
						        System.out.println("2. All Engineers");
						        System.out.println("3. All Sales Person");
						        System.out.println("4. All Employees Alphabetic order ascending");
						        System.out.println("5. All Employees Alphabetic order descending");
						        System.out.println("6. Exit to Main Menu");

						        System.out.println("Enter choice:");
						        choice = ConsoleInput.getInt();

						        switch(choice)
						        {
						            case 1:
						                System.out.println("All Managers:");

						                for(int i = 0; i < count; i++)
						                {
						                    if(employees[i] instanceof Manager)
						                    {
						                        employees[i].displayInfo();
						                        System.out.println("-------------");
						                    }
						                }

						                break;

						            case 2:
						                System.out.println("All Engineers:");

						                for(int i = 0; i < count; i++)
						                {
						                    if(employees[i] instanceof Engineer)
						                    {
						                        employees[i].displayInfo();
						                        System.out.println("-------------");
						                    }
						                }

						                break;

						            case 3:
						                System.out.println("All Sales Person:");

						                for(int i = 0; i < count; i++)
						                {
						                    if(employees[i] instanceof SalesPerson)
						                    {
						                        employees[i].displayInfo();
						                        System.out.println("-------------");
						                    }
						                }

						                break;

						            case 4:
						                System.out.println("All Employees Alphabetic order ascending");

						                for(int i = 0; i < count - 1; i++)
						                {
						                    for(int j = i + 1; j < count; j++)
						                    {
						                        if(employees[i].Name.compareTo(employees[j].Name) > 0)
						                        {
						                            Employee temp = employees[i];
						                            employees[i] = employees[j];
						                            employees[j] = temp;
						                        }
						                    }
						                }

						                for(int i = 0; i < count; i++)
						                {
						                    employees[i].displayInfo();
						                    System.out.println("-------------");
						                }

						                break;

						            case 5:
						                System.out.println("All Employees Alphabetic order descending");

						                for(int i = 0; i < count - 1; i++)
						                {
						                    for(int j = i + 1; j < count; j++)
						                    {
						                        if(employees[i].Name.compareTo(employees[j].Name) < 0)
						                        {
						                            Employee temp = employees[i];
						                            employees[i] = employees[j];
						                            employees[j] = temp;
						                        }
						                    }
						                }

						                for(int i = 0; i < count; i++)
						                {
						                    employees[i].displayInfo();
						                    System.out.println("-------------");
						                }

						                break;

						            case 6:
						                System.out.println("Returning to main menu");
						                break;

						            default:
						                System.out.println("Invalid choice");
						                break;
						        }

						    } while(choice != 6);

						    break;
						
					case 4: 
						System.out.println("Save selected");
						
						break;
						
					case 5: 
						System.out.println("Load selected");
						
						break;
					case 6:
						System.out.println("Exit");
						
						break;
						
					default:
				    	System.out.println("Invalid choice");
				    	
				    	break;
				
				}
				
				}while(choice != 6);

	}

}
