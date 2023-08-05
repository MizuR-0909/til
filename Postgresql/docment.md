## 学習用
### PostgreSQLコンテナの実行(Docker使用)
```
docker run --name postgres-container -e POSTGRES_PASSWORD=mysecretpassword -p 5432:5432 -d postgres:13
```

### ターミナルを使用してコンテナ内のPostgreSQLに接続
```
docker exec -it postgres-container psql -U postgres
```

### PostgreSQLから抜ける方法
```
\q
```
もしくはctrl + D

### Dockerコンテナ停止
```
docker stop postgres-container
```

### Docker起動
```
docker start postgres-container
```
