#### EC2へのアクセス許可
```
chmod 600 <keyname>
```
#### EC2へのSSH接続コマンド
```
ssh -i <keyname> ec2-user@<パブリック IPv4 アドレス>
```
#### プログラムがどのポート番号で待ち受けているか確認
```
sudo lsof -i -n -P
```
※補足
(LISTEN)→他のPCから待ち受けているポート</br>
(ESTABLISHED)→現在接続を受けているポート

#### EC2のライブラリアップデート
```
sudo yum update -y
```

#### Apacheのインストール（ｗebサーバーのソフトウェア）
```
sudo yum -y install httpd
```

#### Apacheの起動
```
sudo systemctl start httpd.service
```

#### Apacheの起動状況確認
```
sudo systemctl status httpd.service
```
