

 
from imageai.Detection import ObjectDetection
import os

# Set the model path
model_path = "yolo-tiny.h5"  # Download from ImageAI's GitHub
input_image_path = "input.jpg"  # Path to the input image
output_image_path = "output.jpg"  # Path to save the output image

# Create an ObjectDetection instance
detector = ObjectDetection()
detector.setModelTypeAsTinyYOLOv3()
detector.setModelPath(model_path)
detector.loadModel()

# Perform object detection
detections = detector.detectObjectsFromImage(input_image=input_image_path, 
                                              output_image_path=output_image_path, 
                                              minimum_percentage_probability=30)

# Print the results
for detection in detections:
    print(f"{detection['name']} : {detection['percentage_probability']}%")