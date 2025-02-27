
# Building a Multi-Service Application with In-Place Upgrades on Kubernetes

## Materials
For this task, we will need to use:
- Docker Desktop
- Minikube
- GitHub


## Deployment Instructions

### 1. Start the Kubernetes environment.

Here, we can follow two different paths:
- Use "minikube".
  Introducing in the terminal the following command.
```sh
minikube start
```

- Use Kubernetes in Docker Desktop.

  In this option, you only have to enable the Kubernetes function in the Docker Desktop and install accept the installation.



### 2. Create the backend and frontend folders.

##### Backend 

- Create the Dockerfile (backend/Dockerfile)
  
- Create API code (backend/app.py)

- Define dependencies (backend/requirements.txt)

- Build the backend image:

```sh
docker build -t backend:v1 ./backend
```

##### Frontend

- Create the Dockerfile (frontend/Dockerfile)
  
- Create the server file (frontend/server.js)

- Define dependencies (frontend/package.json)

- Build the frontend image:

```sh
docker build -t frontend:v1 ./frontend
```

## 3. Create the services files

#### Create the Deployment YAMLs:

- Backend Deployment (backend-deployment.yaml)

- Frontend Deployment (frontend-deployment.yaml)

#### Create the Services YAMLs:

- Backend Service (backend-service.yaml)

- Frontend Service (frontend-service.yaml)

#### Run the Deploys

```sh
kubectl apply -f backend-deployment.yaml
kubectl apply -f backend-service.yaml
kubectl apply -f frontend-deployment.yaml
kubectl apply -f frontend-service.yaml
```

#### Access the Application

Run the following command and enter in the URL from the output.

```sh
minikube service frontend-service --url
```


## 4. Demonstrating In-Place Upgrades (Rolling Update)

Now we are going to edit the backend/app.py file, so that the API returns a new message showing that this is the second version (v2)

#### Build the new backend image:

```sh
docker build -t backend:v2 ./backend
```

#### Update the deployment
```sh
kubectl apply -f backend-deployment.yaml
```

Finally, enter the previous url and check that the message has updated!

#### Rollout (Optional)

```sh
kubectl rollout undo deployment/backend-deployment
```
The output of this command should be "deployment "backend-deployment" successfully rolled out.
