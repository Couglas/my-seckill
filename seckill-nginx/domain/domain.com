server {
    listen 7081;
    location /product {
        default_type text/plain;
        proxy_pass http://backend;
    }
}