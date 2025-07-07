## 🔷 TEAM 1 – **User Manager & Profile App**

### 🎯 Fokus: Manajemen user (list, detail, form)

📄 Total Pages: 10

- LoginActivity
- MainActivity
- FragmentUserList
- FragmentUserDetail
- FragmentUserEdit
- FragmentUserAdd
- FragmentSearchUser
- FragmentUserProfile
- FragmentUserStatistics (chart by gender/age)
- FragmentDeletedUser (mock delete)

---
endpoint
```
https://dummyjson.com
```
---

### 📘 API DOCUMENTATION

#### ✅ GET All Users

- **URL**: `GET /users`
- **Query**: `limit`, `skip`
- **Example**: `/users?limit=10`
- **Response**:

```json
{
  "users": [ { "id": 1, "firstName": "John", ... } ],
  "total": 100,
  "limit": 10,
  "skip": 0
}
```

#### ✅ GET User by ID

- **URL**: `GET /users/{id}`
- **Response**:

```json
{
  "id": 1,
  "firstName": "John",
  "email": "john@example.com"
}
```

#### ✅ POST Add User

- **URL**: `POST /users/add`
- **Body**:

```json
{
  "firstName": "Ahmad",
  "lastName": "Fajar",
  "email": "ahmad@example.com",
  "gender": "male"
}
```

#### ✅ PUT Edit User

- **URL**: `PUT /users/{id}`
- **Body**:

```json
{
  "firstName": "Fajar",
  "email": "fajar@example.com"
}
```

---

## 🔷 TEAM 2 – **Product Explorer & Inventory**

### 🎯 Fokus: Eksplorasi dan manajemen produk

📄 Total Pages: 10

- SplashScreenActivity
- ProductActivity
- FragmentProductList
- FragmentProductDetail
- FragmentProductSearch
- FragmentCategoryList
- FragmentProductByCategory
- FragmentProductAdd
- FragmentProductEdit
- FragmentFavoriteProduct (Room)

---

### 📘 API DOCUMENTATION

#### ✅ GET All Products

- **URL**: `GET /products`
- **Query**: `limit`, `skip`

#### ✅ GET Product by ID

- **URL**: `GET /products/{id}`

#### ✅ GET Categories

- **URL**: `GET /products/categories`

#### ✅ GET Products by Category

- **URL**: `GET /products/category/{category}`

#### ✅ Search Product

- **URL**: `GET /products/search?q=apple`

#### ✅ POST Add Product

- **URL**: `POST /products/add`
- **Body**:

```json
{
  "title": "Macbook Pro 2025",
  "description": "New M4 chip",
  "price": 3000,
  "brand": "Apple",
  "category": "laptops"
}
```

#### ✅ PUT Edit Product

- **URL**: `PUT /products/{id}`
- **Body**:

```json
{
  "price": 2500
}
```

---

## 🔷 TEAM 3 – **Cart & Checkout Simulation**

### 🎯 Fokus: Keranjang, produk, checkout

📄 Total Pages: 10

- LoginActivity
- CartActivity
- FragmentCartList
- FragmentCartDetail
- FragmentProductPicker
- FragmentAddToCart
- FragmentQuantitySelector
- FragmentCartHistory (Room)
- FragmentCartSummary
- FragmentCheckoutResult

---

### 📘 API DOCUMENTATION

#### ✅ POST Login (optional)

- **URL**: `POST /auth/login`
- **Body**:

```json
{
  "username": "emilys",
  "password": "emilyspass"
}  
```

- **Response**:

```json
{
    "accessToken": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwidXNlcm5hbWUiOiJlbWlseXMiLCJlbWFpbCI6ImVtaWx5LmpvaG5zb25AeC5kdW1teWpzb24uY29tIiwiZmlyc3ROYW1lIjoiRW1pbHkiLCJsYXN0TmFtZSI6IkpvaG5zb24iLCJnZW5kZXIiOiJmZW1hbGUiLCJpbWFnZSI6Imh0dHBzOi8vZHVtbXlqc29uLmNvbS9pY29uL2VtaWx5cy8xMjgiLCJpYXQiOjE3NTE4NTI5MDUsImV4cCI6MTc1MTg1NjUwNX0.kfvbKe22OaK7FB0ARemA-vENfEF0jsKF69as_80pgKA",
    "refreshToken": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwidXNlcm5hbWUiOiJlbWlseXMiLCJlbWFpbCI6ImVtaWx5LmpvaG5zb25AeC5kdW1teWpzb24uY29tIiwiZmlyc3ROYW1lIjoiRW1pbHkiLCJsYXN0TmFtZSI6IkpvaG5zb24iLCJnZW5kZXIiOiJmZW1hbGUiLCJpbWFnZSI6Imh0dHBzOi8vZHVtbXlqc29uLmNvbS9pY29uL2VtaWx5cy8xMjgiLCJpYXQiOjE3NTE4NTI5MDUsImV4cCI6MTc1NDQ0NDkwNX0.yoaiiRDD2ytagHTApsda7Lu8pcpT0m8-vPIjACKBXhI",
    "id": 1,
    "username": "emilys",
    "email": "emily.johnson@x.dummyjson.com",
    "firstName": "Emily",
    "lastName": "Johnson",
    "gender": "female",
    "image": "https://dummyjson.com/icon/emilys/128"
}
```

#### ✅ GET Products

- **URL**: `GET /products`

#### ✅ POST Add to Cart

- **URL**: `POST /carts/add`
- **Body**:

```json
{
  "userId": 1,
  "products": [
    { "id": 1, "quantity": 2 },
    { "id": 3, "quantity": 1 }
  ]
}
```

#### ✅ GET Cart by User

- **URL**: `GET /carts/user/{userId}`

---

## 🔷 TEAM 4 – **Product Insights & Analytics**

### 🎯 Fokus: Statistik produk, rating, analisis

📄 Total Pages: 10

- DashboardActivity
- FragmentProductList
- FragmentProductStats (avg rating, max/min price)
- FragmentRatingChart (MPAndroidChart)
- FragmentBrandFilter
- FragmentWordFrequency (analisis deskripsi)
- FragmentTrendingProduct (mock filter)
- FragmentProductCompare
- FragmentProductDetail
- FragmentProductSearch

---

### 📘 API DOCUMENTATION

#### ✅ GET Products

- **URL**: `GET /products`

#### ✅ Search Product

- **URL**: `GET /products/search?q=...`

#### ✅ GET Product by ID

- **URL**: `GET /products/{id}`

---
