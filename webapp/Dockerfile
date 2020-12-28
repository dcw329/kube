# Build
FROM node:12-alpine as BUILD_IMAGE

WORKDIR /app
COPY package*.json /app/
RUN npm install
COPY ./ /app/
RUN npm run build


# Runnable
FROM nginx:1.14.2

COPY --from=BUILD_IMAGE /app/build/ /usr/share/nginx/html
COPY nginx.conf /etc/nginx/conf.d/default.conf
EXPOSE 80
EXPOSE 3000