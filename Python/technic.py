users = [
    {'id':1, 'name':'John', 'email':'john@gmail.com', 'age': 20},
    {'id':2, 'name':'Sarah', 'email':'sarah@gmai.com', 'age': 25},
    {'id':3, 'name':'Alex', 'email':'alex@gmail.com','age': 1000},
    {'id':4, 'name':'Adam', 'email':'adam@gmail.com', 'age': 40},
]

#forの場合
emails = []
for user in users:
    if user['age'] < 30:
        emails.append(user['email'])
# print(emails)

#リスト内包表記
young_user_emails = [user['email'] for user in users if user['age'] < 30]
# print(young_user_emails)

#辞書内包表記
#idをキーにして、0(1)でアクセスできる辞書を作成
users_key_by_id = {user['id']: user for user in users}
# print(users_key_by_id)

#ユニークな名前の集合を取得
namme_set = {user['name'] for user in users}
# print(namme_set)

#ジェネレータ式の応用
user = next((user for user in users if user.get('age', 0) == 25), None)
# print(user)

def func():
    print(f'__name__: {__name__}')
    
# func()

if __name__ == '__main__':
    print('technic.py is being run directly')
    func()

