<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>🚗 Car Dealership</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: Arial, sans-serif;
            background: #f0f2f5;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }
        .container {
            background: white;
            padding: 40px;
            border-radius: 12px;
            box-shadow: 0 4px 20px rgba(0,0,0,0.1);
            max-width: 500px;
            width: 100%;
            text-align: center;
        }
        h1 {
            color: #1a1a2e;
            font-size: 28px;
            margin-bottom: 10px;
        }
        .subtitle {
            color: #666;
            font-size: 14px;
            margin-bottom: 30px;
        }
        .button-group {
            display: flex;
            flex-direction: column;
            gap: 12px;
        }
        .btn {
            padding: 14px 24px;
            border: none;
            border-radius: 8px;
            font-size: 16px;
            font-weight: 600;
            cursor: pointer;
            transition: all 0.3s;
            text-decoration: none;
            display: block;
        }
        .btn-sport {
            background: #e94560;
            color: white;
        }
        .btn-sport:hover {
            background: #c73652;
            transform: translateY(-2px);
            box-shadow: 0 4px 12px rgba(233, 69, 96, 0.3);
        }
        .btn-hyper {
            background: #0f3460;
            color: white;
        }
        .btn-hyper:hover {
            background: #0a2647;
            transform: translateY(-2px);
            box-shadow: 0 4px 12px rgba(15, 52, 96, 0.3);
        }
        .btn-electric {
            background: #00b894;
            color: white;
        }
        .btn-electric:hover {
            background: #00a381;
            transform: translateY(-2px);
            box-shadow: 0 4px 12px rgba(0, 184, 148, 0.3);
        }
        .btn-all {
            background: #2d3436;
            color: white;
            margin-top: 8px;
        }
        .btn-all:hover {
            background: #1a1a1a;
            transform: translateY(-2px);
        }
        .divider {
            border: none;
            border-top: 1px solid #e0e0e0;
            margin: 20px 0;
        }
        .footer {
            margin-top: 20px;
            color: #999;
            font-size: 12px;
        }
        .status {
            margin-top: 15px;
            padding: 10px;
            background: #fff3cd;
            border-radius: 6px;
            color: #856404;
            font-size: 14px;
            display: none;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>🚗 Car Dealership</h1>
    <p class="subtitle">Выберите тип автомобиля</p>

    <div class="button-group">
        <!-- Кнопки ведут на твой Spring контроллер -->
        <a href="/car-dealership/dealership/catalog?type=sportCar" class="btn btn-sport">
            🏎️ Sport Car
        </a>
        <a href="/car-dealership/dealership/catalog?type=hyperCar" class="btn btn-hyper">
            🚀 Hyper Car
        </a>
        <a href="/car-dealership/dealership/catalog?type=electricCar" class="btn btn-electric">
            ⚡ Electric Car
        </a>

        <hr class="divider">

        <a href="/car-dealership/dealership/catalog?type=all" class="btn btn-all">
            📋 Show All Cars
        </a>
    </div>

    <div id="status" class="status">
        ℹ️ Выберите автомобиль для просмотра
    </div>

    <div class="footer">
        Spring MVC + Tomcat • 2026
    </div>
</div>

<script>
    document.querySelectorAll('.btn').forEach(btn => {
        btn.addEventListener('click', function(e) {
            const status = document.getElementById('status');
            status.style.display = 'block';
            status.textContent = '⏳ Загрузка...';
        });
    });
</script>
</body>
</html>