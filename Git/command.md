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

## 空コミット
```
git commit --allow-empty -m ""
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

## ステージングエリアとHEADの差分を表示
```
git diff --cached
```

## バージョン管理の対象になっているか確認
```
git status
```

## バージョン管理しないファイルを指定
```
.gitignore
// .gitinoreにファイル名を記述
```

## ブランチ一覧
```
git branch
```

## ブランチ作成とチェックアウト
```
git checkout -b <branch-name>
//もしくは
git switch -c <branch-name>
```

## HEADのコミットを変更取り消しコミット追加
```
git revert HEAD
```

## 変更の一時的避難
```
git stash
```
## 避難させたものを反映
```
git stash pop
```
```
// ステージングエリアにも反映
git stash pop --index
```
## 退避させた変更のリスト表示
```
git stash list
```
## git操作履歴表示
```
git reflog
```
## 操作取り消し
```
// 一番最近の取り消し
git reset --hard HEAD@{1}
```
## だれが記述した行か確認
```
git blame <file>
```

## gitHubからクローン
```
git clone <URL>
```

## リモートへプッシュ
```
git push originローカルブランチ名:リモートブランチ名
```
```
// 上流ブランチとしてプッシュ
git push -u origin ローカルブランチ名
```

## 全てのブランチ表示(追跡ブランチ)
```
git branch -a
```

# fetch
```
// ファイル名指定
git fetch <file>
```
```
// HEAD
git fetch
```
```
// リモートリポジトリ全て
git fetch origin
```
# マージ
```
git merge origin/branch-name
```

#pull
```
git pull origin branch-name
```



## リモートリポジトリからローカルリポジトリへブランチ作成とチェックアウト
```
git checkout -b <branch-name> origin/<branch-name>
```

## ブランチ削除
```
git checkout -d <branch-name>
git checkout -D <branch-name> //強制削除
```

<!-- 変更を戻る方法 -->
## ワーキングディレクトリ内
```
git checkout -- ファイル名 //ファイル指定
git checkout -- . //全て
```

## ステージング
```
git reset HEAD ファイル名 //ファイル指定
git reset HEAD //全て
```

## ローカルコミット
```
// 最後のコミット取り消し（ステージング状態保持）
git reset --soft HEAD~1
// 最後のコミット取り消し（変更も破棄）
git reset --hard HEAD~1
```

## リモート同期
```
git revert コミットID
git push origin ブランチ名
```
