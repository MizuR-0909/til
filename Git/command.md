## Git初期化
```
git init
```

## ステージングエリアに追加
```
git add <ファイル>
```
```
// ワークツリー全てのファイル
git add .
```

## ステージングに入っているファイルのリスト表示
```
git ls-files
```

## ローカルリポジトリにコミット
```
git commit -m "<Message>"
```
```
// addも同時実行
git commit -a -m "<Message>"
```

## コミット履歴表示
```
git log
```
```
// 統計情報を含めて表示
git log --stat
```
```
git log --oneline --graph --all
```

## ワークツリーとステージングエリアの差分表示
```
git diff
```


