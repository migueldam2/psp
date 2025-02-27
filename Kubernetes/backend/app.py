from fastapi import FastAPI

app = FastAPI()

@app.get("/")
def read_root():
    return {"message": "Hello from FastAPI v2 - Upgraded!"}


@app.get("/status")
def get_status():
    return {"status": "API Running", "host: os.getenv("HOSTNAME")}
