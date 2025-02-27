const express = require("express");
const axios = require("axios");

const app = express();
const PORT = 3000;

app.get("/", async (req, res) => {
    try {
        const response = await axios.get("http://backend-service:8000/");
        res.send(`Frontend with data from backend: ${response.data.message}`);
    } catch (error) {
        res.send("Error connecting to backend");
    }
});

app.listen(PORT, () => console.log(`Frontend running on port ${PORT}`));
