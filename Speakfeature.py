
# New file for speak feature 

import pyttsx3
engine = pyttsx3.init()  

 
rate = engine.getProperty('rate')   
print (rate)                         
engine.setProperty('rate', 200)      


 
volume = engine.getProperty('volume')   
print (volume)                          
engine.setProperty('volume',5.0)    

 
voices = engine.getProperty('voices')       
engine.setProperty('voice', voices[0].id)    

engine.say("Your Payment Successfully")
engine.say("Your bike is unlock")
engine.say("Thankyou for your experince, Please visit once again")
engine.runAndWait()
engine.stop()
 
engine.save_to_file('Thankyou for visit here', 'test.mp3')
engine.runAndWait()