FROM python:3.7

WORKDIR /code
COPY requirements.txt app.py run.sh ./
RUN pip install -r requirements.txt
COPY requirements.txt .

EXPOSE 5000
CMD [ "./run.sh" ]
