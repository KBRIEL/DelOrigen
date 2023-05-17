from fastapi import FastAPI
from pydantic import BaseModel

app = FastAPI()

class Msg(BaseModel):
    msg: str


@app.get("/")
async def root():
    return {"message": " Welcome to Del Origen!"}

@app.get("/frutas")
async def frutas():
    return [
    {
      "precio": 500,
      "id": 1,
      "title": "Manzanas",
      "thumbnailUrl": "./img/Manzanas.jpg"
    },
    {
      "precio ": 300,
      "id": 2,
      "title": "Peras",
      "hola":"hola1",
      "thumbnailUrl": "./img/pera.jpg"
    },
    {
      "precio": 100,
      "id": 3,
      "title": "Espinaca",
      "hola":"Hola2",
      "thumbnailUrl": "./img/espinaca.jpg"
    },
    {
      "precio": 50,
      "id": 4,
      "title": "Sandía",
      "thumbnailUrl": "./img/sandia.jpg"
    },
    {
      "precio": 100,
      "id": 5,
      "title": "Mango",
      "thumbnailUrl": "./img/mango.jpg"
    },
    {
      "precio": 150,
      "id": 6,
      "title": "Papas",
      "thumbnailUrl": "./img/papas.jpg"
    }
  ]



@app.get("/path")
async def demo_get():
    return {"message": "This is /path endpoint, use a post request to transform the text to uppercase"}


@app.post("/path")
async def demo_post(inp: Msg):
    return {"message": inp.msg.upper()}


@app.get("/path/{path_id}")
async def demo_get_path_id(path_id: int):
    return {"message": f"This is /path/{path_id} endpoint, use post request to retrieve result"}
