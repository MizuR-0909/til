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
※補足</br>
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
①
```
sudo systemctl status httpd.service
```
②
```
ps -axu | grep httpd
```

#### Apacheの自動起動設定
```
sudo systemctl enable httpd.service
```

#### Apacheの自動起動が設定されている確認
```
sudo systemctl is-enabled httpd.service
```
＊enabledと返ってっくればOK

#### ドメインのネームサーバーの設定を確認
```
dig <domain> NS +short
```
