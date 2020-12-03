USE [master]
GO
/****** Object:  Database [20201203_ricette]    Script Date: 03/12/2020 16:36:08 ******/
CREATE DATABASE [20201203_ricette]
GO
USE [20201203_ricette]
GO
/****** Object:  Table [dbo].[categoria]    Script Date: 03/12/2020 16:36:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[categoria](
	[id_categoria] [int] IDENTITY(1,1) NOT NULL,
	[nome_categoria] [varchar](30) NOT NULL,
 CONSTRAINT [PK_categoria] PRIMARY KEY CLUSTERED 
(
	[id_categoria] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[cuoco]    Script Date: 03/12/2020 16:36:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[cuoco](
	[id_cuoco] [int] IDENTITY(1,1) NOT NULL,
	[nome_cuoco] [varchar](50) NOT NULL,
 CONSTRAINT [PK_cuoco] PRIMARY KEY CLUSTERED 
(
	[id_cuoco] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ingrediente]    Script Date: 03/12/2020 16:36:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ingrediente](
	[id_ingrediente] [int] IDENTITY(1,1) NOT NULL,
	[nome_ingrediente] [varchar](100) NOT NULL,
 CONSTRAINT [PK_ingrediente] PRIMARY KEY CLUSTERED 
(
	[id_ingrediente] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[istruzione]    Script Date: 03/12/2020 16:36:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[istruzione](
	[id_istruzione] [int] IDENTITY(1,1) NOT NULL,
	[istruzione] [varchar](1000) NOT NULL,
	[numero_passo] [int] NOT NULL,
	[tempo] [float] NULL,
	[unita_misura_tempo] [varchar](5) NULL,
	[id_ricetta] [int] NOT NULL,
 CONSTRAINT [PK_istruzione] PRIMARY KEY CLUSTERED 
(
	[id_istruzione] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ricetta]    Script Date: 03/12/2020 16:36:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ricetta](
	[id_ricetta] [int] IDENTITY(1,1) NOT NULL,
	[nome_ricetta] [varchar](100) NOT NULL,
	[difficolta] [int] NULL,
	[id_categoria] [int] NOT NULL,
	[id_cuoco] [int] NOT NULL,
 CONSTRAINT [PK_ricetta] PRIMARY KEY CLUSTERED 
(
	[id_ricetta] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ricetta_ingrediente]    Script Date: 03/12/2020 16:36:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ricetta_ingrediente](
	[id_ricetta] [int] NOT NULL,
	[id_ingrediente] [int] NOT NULL,
	[quantita] [float] NOT NULL,
	[unita_misura] [varchar](5) NOT NULL,
 CONSTRAINT [PK_ricetta_ingrediente] PRIMARY KEY CLUSTERED 
(
	[id_ricetta] ASC,
	[id_ingrediente] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ricetta_ingrediente_istruzione]    Script Date: 03/12/2020 16:36:08 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ricetta_ingrediente_istruzione](
	[id_ricetta] [int] NOT NULL,
	[id_ingrediente] [int] NOT NULL,
	[id_istruzione] [int] NOT NULL,
	[parte_ingrediente] [varchar](100) NULL,
	[quantita] [float] NULL,
	[unita_misura] [varchar](5) NULL,
 CONSTRAINT [PK_ricetta_ingrediente_istruzione] PRIMARY KEY CLUSTERED 
(
	[id_ricetta] ASC,
	[id_ingrediente] ASC,
	[id_istruzione] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[categoria] ON 

INSERT [dbo].[categoria] ([id_categoria], [nome_categoria]) VALUES (1, N'Primi')
INSERT [dbo].[categoria] ([id_categoria], [nome_categoria]) VALUES (2, N'Secondi')
INSERT [dbo].[categoria] ([id_categoria], [nome_categoria]) VALUES (3, N'Dolci')
INSERT [dbo].[categoria] ([id_categoria], [nome_categoria]) VALUES (4, N'Contorni')
INSERT [dbo].[categoria] ([id_categoria], [nome_categoria]) VALUES (5, N'Antipasti')
INSERT [dbo].[categoria] ([id_categoria], [nome_categoria]) VALUES (6, N'Condimenti')
SET IDENTITY_INSERT [dbo].[categoria] OFF
SET IDENTITY_INSERT [dbo].[cuoco] ON 

INSERT [dbo].[cuoco] ([id_cuoco], [nome_cuoco]) VALUES (1, N'Andrea C.')
INSERT [dbo].[cuoco] ([id_cuoco], [nome_cuoco]) VALUES (2, N'Mario R.')
SET IDENTITY_INSERT [dbo].[cuoco] OFF
SET IDENTITY_INSERT [dbo].[ingrediente] ON 

INSERT [dbo].[ingrediente] ([id_ingrediente], [nome_ingrediente]) VALUES (1, N'Mascarpone')
INSERT [dbo].[ingrediente] ([id_ingrediente], [nome_ingrediente]) VALUES (2, N'Uovo')
INSERT [dbo].[ingrediente] ([id_ingrediente], [nome_ingrediente]) VALUES (3, N'Caffè')
INSERT [dbo].[ingrediente] ([id_ingrediente], [nome_ingrediente]) VALUES (4, N'Zucchero')
INSERT [dbo].[ingrediente] ([id_ingrediente], [nome_ingrediente]) VALUES (5, N'Cacao')
INSERT [dbo].[ingrediente] ([id_ingrediente], [nome_ingrediente]) VALUES (6, N'Savoiardi')
SET IDENTITY_INSERT [dbo].[ingrediente] OFF
SET IDENTITY_INSERT [dbo].[istruzione] ON 

INSERT [dbo].[istruzione] ([id_istruzione], [istruzione], [numero_passo], [tempo], [unita_misura_tempo], [id_ricetta]) VALUES (1, N'Unire i tuoli d''uovo con metà dello zucchero e sbattere con lo sbattitore', 1, 10, N'min', 1)
INSERT [dbo].[istruzione] ([id_istruzione], [istruzione], [numero_passo], [tempo], [unita_misura_tempo], [id_ricetta]) VALUES (2, N'Montare a neve gli albumi', 3, 15, N'min', 1)
INSERT [dbo].[istruzione] ([id_istruzione], [istruzione], [numero_passo], [tempo], [unita_misura_tempo], [id_ricetta]) VALUES (4, N'Unire il mascarpone alla crema ottenuta al punto precedente', 2, 5, N'min', 1)
SET IDENTITY_INSERT [dbo].[istruzione] OFF
SET IDENTITY_INSERT [dbo].[ricetta] ON 

INSERT [dbo].[ricetta] ([id_ricetta], [nome_ricetta], [difficolta], [id_categoria], [id_cuoco]) VALUES (1, N'Tiramisù', 3, 3, 1)
INSERT [dbo].[ricetta] ([id_ricetta], [nome_ricetta], [difficolta], [id_categoria], [id_cuoco]) VALUES (2, N'Zabaione', 1, 3, 2)
INSERT [dbo].[ricetta] ([id_ricetta], [nome_ricetta], [difficolta], [id_categoria], [id_cuoco]) VALUES (3, N'Spaghetti alla carbonara', 2, 1, 1)
INSERT [dbo].[ricetta] ([id_ricetta], [nome_ricetta], [difficolta], [id_categoria], [id_cuoco]) VALUES (4, N'Pesto', 4, 6, 2)
SET IDENTITY_INSERT [dbo].[ricetta] OFF
INSERT [dbo].[ricetta_ingrediente] ([id_ricetta], [id_ingrediente], [quantita], [unita_misura]) VALUES (1, 1, 500, N'gr')
INSERT [dbo].[ricetta_ingrediente] ([id_ricetta], [id_ingrediente], [quantita], [unita_misura]) VALUES (1, 2, 4, N'n.')
INSERT [dbo].[ricetta_ingrediente] ([id_ricetta], [id_ingrediente], [quantita], [unita_misura]) VALUES (1, 3, 1, N'tazza')
INSERT [dbo].[ricetta_ingrediente] ([id_ricetta], [id_ingrediente], [quantita], [unita_misura]) VALUES (1, 4, 100, N'gr')
INSERT [dbo].[ricetta_ingrediente] ([id_ricetta], [id_ingrediente], [quantita], [unita_misura]) VALUES (1, 5, 10, N'gr')
INSERT [dbo].[ricetta_ingrediente] ([id_ricetta], [id_ingrediente], [quantita], [unita_misura]) VALUES (1, 6, 300, N'gr')
INSERT [dbo].[ricetta_ingrediente_istruzione] ([id_ricetta], [id_ingrediente], [id_istruzione], [parte_ingrediente], [quantita], [unita_misura]) VALUES (1, 2, 1, N'tuorlo', 4, N'n.')
INSERT [dbo].[ricetta_ingrediente_istruzione] ([id_ricetta], [id_ingrediente], [id_istruzione], [parte_ingrediente], [quantita], [unita_misura]) VALUES (1, 2, 2, N'albume', 4, N'n.')
INSERT [dbo].[ricetta_ingrediente_istruzione] ([id_ricetta], [id_ingrediente], [id_istruzione], [parte_ingrediente], [quantita], [unita_misura]) VALUES (1, 4, 1, NULL, 50, N'gr')
ALTER TABLE [dbo].[istruzione]  WITH CHECK ADD  CONSTRAINT [FK_istruzione_ricetta] FOREIGN KEY([id_ricetta])
REFERENCES [dbo].[ricetta] ([id_ricetta])
GO
ALTER TABLE [dbo].[istruzione] CHECK CONSTRAINT [FK_istruzione_ricetta]
GO
ALTER TABLE [dbo].[ricetta]  WITH CHECK ADD  CONSTRAINT [FK_ricetta_categoria] FOREIGN KEY([id_categoria])
REFERENCES [dbo].[categoria] ([id_categoria])
GO
ALTER TABLE [dbo].[ricetta] CHECK CONSTRAINT [FK_ricetta_categoria]
GO
ALTER TABLE [dbo].[ricetta]  WITH CHECK ADD  CONSTRAINT [FK_ricetta_cuoco] FOREIGN KEY([id_cuoco])
REFERENCES [dbo].[cuoco] ([id_cuoco])
GO
ALTER TABLE [dbo].[ricetta] CHECK CONSTRAINT [FK_ricetta_cuoco]
GO
ALTER TABLE [dbo].[ricetta_ingrediente]  WITH CHECK ADD  CONSTRAINT [FK_ricetta_ingrediente_ingrediente] FOREIGN KEY([id_ingrediente])
REFERENCES [dbo].[ingrediente] ([id_ingrediente])
GO
ALTER TABLE [dbo].[ricetta_ingrediente] CHECK CONSTRAINT [FK_ricetta_ingrediente_ingrediente]
GO
ALTER TABLE [dbo].[ricetta_ingrediente]  WITH CHECK ADD  CONSTRAINT [FK_ricetta_ingrediente_ricetta] FOREIGN KEY([id_ricetta])
REFERENCES [dbo].[ricetta] ([id_ricetta])
GO
ALTER TABLE [dbo].[ricetta_ingrediente] CHECK CONSTRAINT [FK_ricetta_ingrediente_ricetta]
GO
ALTER TABLE [dbo].[ricetta_ingrediente_istruzione]  WITH CHECK ADD  CONSTRAINT [FK_ricetta_ingrediente_istruzione_istruzione] FOREIGN KEY([id_istruzione])
REFERENCES [dbo].[istruzione] ([id_istruzione])
GO
ALTER TABLE [dbo].[ricetta_ingrediente_istruzione] CHECK CONSTRAINT [FK_ricetta_ingrediente_istruzione_istruzione]
GO
ALTER TABLE [dbo].[ricetta_ingrediente_istruzione]  WITH CHECK ADD  CONSTRAINT [FK_ricetta_ingrediente_istruzione_ricetta_ingrediente] FOREIGN KEY([id_ricetta], [id_ingrediente])
REFERENCES [dbo].[ricetta_ingrediente] ([id_ricetta], [id_ingrediente])
GO
ALTER TABLE [dbo].[ricetta_ingrediente_istruzione] CHECK CONSTRAINT [FK_ricetta_ingrediente_istruzione_ricetta_ingrediente]
GO
USE [master]
GO
ALTER DATABASE [20201203_ricette] SET  READ_WRITE 
GO
